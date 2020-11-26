package com.cloud.springcloud.controller;

import com.cloud.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author fty
 * @date 2020/11/19 15:41
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService ;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result =paymentHystrixService.paymentInfo_OK(id);
        return  result ;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
//    })
    @HystrixCommand
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        int age = 10/0 ;
        String result = paymentHystrixService.paymentInfo_Timeout(id);
        return result ;
        //try{ TimeUnit.MILLISECONDS.sleep(3000);}catch (InterruptedException e){ e.printStackTrace(); }
        //return "线程池： "+Thread.currentThread().getName()+ "paymentInfo_Timeout,id: "+id+"\t" +"(*^_^*)哈哈"+"耗时(秒)";
    }

    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id){
        return "我是消费者80，对方支付系统繁忙请稍后重试或者自己运行错误请检查自己，/(ㄒoㄒ)/~~";
    }

    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后重试,/(ㄒoㄒ)/~~";
    }
}
