package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fty
 * @date 2020/11/12 18:38
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
     public static void main(String[] args){
                SpringApplication.run(OrderZKMain80.class, args);
         }
}
