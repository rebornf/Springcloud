package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fty
 * @date 2020/11/13 11:12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
     public static void main(String[] args){
                SpringApplication.run(PaymentMain8006.class, args);
         }
}
