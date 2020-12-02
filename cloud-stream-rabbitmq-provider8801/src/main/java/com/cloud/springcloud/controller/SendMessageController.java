package com.cloud.springcloud.alibaba.controller;

import com.cloud.springcloud.alibaba.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fty
 * @date 2020/11/26 14:58
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider ;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
