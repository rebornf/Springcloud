package com.cloud.springcloud.alibaba.service.impl;

import com.cloud.springcloud.alibaba.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author fty
 * @date 2020/11/26 14:19
 */
@EnableBinding(Source.class) //定义消息推送的管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output ;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("******serial: "+serial);
        return null;
    }
}
