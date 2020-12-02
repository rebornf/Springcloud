package com.cloud.springcloud.alibaba; /**
 * Created with IntelliJ IDEA By fty on 2020/11/3
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/11/3 14:52
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args){
           SpringApplication.run(PaymentMain8001.class,args);
    }
}
