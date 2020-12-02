package com.cloud.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fty
 * @date 2020/11/30 21:15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {
     public static void main(String[] args){
                SpringApplication.run(PaymentMain9004.class, args);
         }
}
