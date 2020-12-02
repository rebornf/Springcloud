package com.cloud.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.util.resources.ga.LocaleNames_ga;

import java.math.BigDecimal;

/**
 * @author fty
 * @date 2020/12/2 17:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id ;

    private Long userId ;

    private Long productId ;

    private Integer count ;

    private BigDecimal money ;

    private  Integer status ;
}

