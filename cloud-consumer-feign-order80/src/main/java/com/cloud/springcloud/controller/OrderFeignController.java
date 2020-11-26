package com.cloud.springcloud.controller;

import com.cloud.springcloud.entities.CommonResult;
import com.cloud.springcloud.entities.Payment;
import com.cloud.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fty
 * @date 2020/11/16 15:46
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService ;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign-ribbon，客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
