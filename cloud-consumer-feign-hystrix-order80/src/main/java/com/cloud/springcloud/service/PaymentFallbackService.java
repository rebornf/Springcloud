package com.cloud.springcloud.alibaba.service;

import org.springframework.stereotype.Component;

/**
 * @author fty
 * @date 2020/11/19 22:35
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {

        return "-----PaymentFallbackService fall back-paymentInfo_ok ,/(ㄒoㄒ)/~~" ;
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {

        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
