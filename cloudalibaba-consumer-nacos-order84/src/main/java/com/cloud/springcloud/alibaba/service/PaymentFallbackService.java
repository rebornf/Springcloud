package com.cloud.springcloud.service;

import com.cloud.springcloud.entities.CommonResult;
import com.cloud.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author fty
 * @date 2020/12/2 11:34
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(4444,"服务降级返回,------PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
