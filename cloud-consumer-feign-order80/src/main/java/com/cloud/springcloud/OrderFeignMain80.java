package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author fty
 * @date 2020/11/16 15:16
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
     public static void main(String[] args){
                SpringApplication.run(OrderFeignMain80.class, args);
         }
}
