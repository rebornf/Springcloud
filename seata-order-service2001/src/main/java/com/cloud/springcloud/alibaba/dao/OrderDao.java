package com.cloud.springcloud.alibaba.dao;

import com.cloud.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author fty
 * @date 2020/12/2 17:04
 */
@Mapper
public interface OrderDao {

    //新建订单
    void create (Order order) ;

    //修改订单状态
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
