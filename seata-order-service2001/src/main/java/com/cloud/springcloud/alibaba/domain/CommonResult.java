package com.cloud.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fty
 * @date 2020/12/2 16:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private  Integer code ;
    private  String message ;
    private  T       data ;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
