package com.cloud.springcloud.controller; /**
 * Created with IntelliJ IDEA By fty on 2020/11/3
 */

import com.cloud.springcloud.entities.CommonResult;
import com.cloud.springcloud.entities.Payment;
import com.cloud.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果:"+result);

        if (result > 0 ){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment= paymentService.getPaymentById(id);
        log.info("****插入结果:"+payment+"\t"+"h哈哈哈哈" );

        if (payment != null){
            return new CommonResult(200,"查询结果成功",payment);
        }else {
            return new CommonResult(444,"没有对应的ID:"+id,null);
        }
    }
}
