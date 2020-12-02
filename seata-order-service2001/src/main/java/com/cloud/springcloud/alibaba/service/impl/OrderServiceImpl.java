package com.cloud.springcloud.alibaba.service.impl;

import com.cloud.springcloud.alibaba.dao.OrderDao;
import com.cloud.springcloud.alibaba.domain.Order;
import com.cloud.springcloud.alibaba.service.AccountService;
import com.cloud.springcloud.alibaba.service.OrderService;
import com.cloud.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fty
 * @date 2020/12/2 19:12
 */
@Service
@Slf4j
public class OrderServiceImpl  implements OrderService {

    @Resource
    private OrderDao orderDao ;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    public void create(Order order) {
        //新建订单
        log.info("---->开始创建订单");
        orderDao.create(order);

        //扣减库存
        log.info("---->订单微服务开始调用库存");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("---->订单微服务开始调用库存，做扣减end");

        //扣减账户
        log.info("---->订单微服务开始调用账户，做扣减money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("---->订单微服务开始调用账户,做扣减end");

        //修改订单状态
        log.info("---->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("---->修改订单状态结束");

        log.info("---->下订单结束了,哈哈哈(*^_^*)");

    }
}
