package com.cloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fty
 * @date 2020/11/14 15:02
 */

@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
