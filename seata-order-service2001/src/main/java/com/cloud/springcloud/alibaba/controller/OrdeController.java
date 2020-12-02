package com.cloud.springcloud.alibaba.controller;

import com.cloud.springcloud.alibaba.domain.CommonResult;
import com.cloud.springcloud.alibaba.domain.Order;
import com.cloud.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fty
 * @date 2020/12/2 21:07
 */
@RestController
public class OrdeController {

    @Resource
    private OrderService orderService ;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
