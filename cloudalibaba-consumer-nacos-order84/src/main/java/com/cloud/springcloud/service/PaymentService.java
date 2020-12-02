package com.cloud.springcloud.alibaba.service;

import com.cloud.springcloud.alibaba.entities.CommonResult;
import com.cloud.springcloud.alibaba.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author fty
 * @date 2020/12/2 11:30
 */
@FeignClient(value = "nacos-payment-service",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
