package com.cloud.springcloud.alibaba.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fty
 * @date 2020/11/30 20:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003 {
     public static void main(String[] args){
                SpringApplication.run(PaymentMain9003.class, args);
         }
}
