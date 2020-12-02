package com.cloud.springcloud.alibaba.service;

import com.cloud.springcloud.alibaba.domain.Order;

/**
 * @author fty
 * @date 2020/12/2 19:10
 */
public interface OrderService {
    void create(Order order);
}
