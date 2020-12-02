package com.cloud.springcloud.alibaba.service;

import com.cloud.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author fty
 * @date 2020/12/2 19:18
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @GetMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,@RequestParam("money")BigDecimal money);
}
