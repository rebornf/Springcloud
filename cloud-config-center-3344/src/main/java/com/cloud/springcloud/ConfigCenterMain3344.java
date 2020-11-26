package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author fty
 * @date 2020/11/24 21:58
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
     public static void main(String[] args){
                SpringApplication.run(ConfigCenterMain3344.class, args);
         }
}
