package com.cloud.springcloud.alibaba.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.springcloud.alibaba.entities.CommonResult;

/**
 * @author fty
 * @date 2020/11/30 19:31
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义,,global handlerException------1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义,,global handlerException------2");
    }
}
