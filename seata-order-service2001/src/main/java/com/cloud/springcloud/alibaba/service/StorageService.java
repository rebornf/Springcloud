package com.cloud.springcloud.alibaba.service;

import com.cloud.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fty
 * @date 2020/12/2 19:19
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @GetMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
