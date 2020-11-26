package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author fty
 * @date 2020/11/20 20:29
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
     public static void main(String[] args){
                SpringApplication.run(HystrixDashboardMain9001.class, args);
         }
}
