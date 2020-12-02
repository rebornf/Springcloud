package com.cloud.springcloud.alibaba.config; /**
 * Created with IntelliJ IDEA By fty on 2020/11/3
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/11/3 22:37
 * @Version V1.0
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced   //使用LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
