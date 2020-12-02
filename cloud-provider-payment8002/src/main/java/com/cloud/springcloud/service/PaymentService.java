package com.cloud.springcloud.alibaba.service;

import com.cloud.springcloud.alibaba.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA By fty on 2020/11/3
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
