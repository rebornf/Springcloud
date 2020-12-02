package com.cloud.springcloud.alibaba.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.GroupSequence;

/**
 * @author fty
 * @date 2020/11/27 13:57
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort ;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos registry,serverPort: "+serverPort+"\t id"+id;
    }
}
