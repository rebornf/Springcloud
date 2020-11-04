package com.cloud.springcloud.entities; /**
 * Created with IntelliJ IDEA By fty on 2020/11/3
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/11/3 15:18
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code ;
    private String  message ;
    private T       data ;

    public CommonResult(Integer code ,String message){ //由于上面传全参或者空参 ，所以在定义传输两个参数
        this(code,message,null);
    }
}
