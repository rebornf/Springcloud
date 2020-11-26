package com.cloud.springcloud.controller; /**
 * Created with IntelliJ IDEA By fty on 2020/11/3
 */

import com.cloud.springcloud.entities.CommonResult;
import com.cloud.springcloud.entities.Payment;
import com.cloud.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * @Author fty
 * @Description TODO
 * @Date 2020/11/3 20:11
 * @Version V1.0
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService ;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果:"+result);

        if (result > 0 ){
            return new CommonResult(200,"插入数据库成功,serverPort:"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment= paymentService.getPaymentById(id);
        log.info("****插入结果:"+payment+"\t"+"哈哈哈哈" );
        if (payment != null){
            return new CommonResult(200,"查询结果成功,serverPort:"+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应的ID:"+id,null);
        }
    }
    @GetMapping(value = "payment/discovery")
    public Object discovery(){
        List<String> services =discoveryClient.getServices();
        for (String element:
             services) {
            log.info("****element: "+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance:
             instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort ;
    }


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try{ TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){ e.printStackTrace(); }
        return serverPort ;
    }


}
