package com.cloud.springcloud.alibaba.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fty
 * @date 2020/11/30 13:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
     public static void main(String[] args){
                SpringApplication.run(MainApp8401.class, args);
         }
}
