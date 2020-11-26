package com.cloud.springcloud; /**
 * Created with IntelliJ IDEA By fty on 2020/11/3
 */

import com.cloud.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/11/3 21:36
 * @Version V1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyselfRule.class)
public class OrderMain80 {
    public static void main(String[] args){
           SpringApplication.run(OrderMain80.class, args);
    }
}
