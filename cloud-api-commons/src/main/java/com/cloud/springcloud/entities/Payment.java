package com.cloud.springcloud.entities; /**
 * Created with IntelliJ IDEA By fty on 2020/11/3
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author fty
 * @Description  entities 1 主实体Payment
 *                       2 Json 封装体 CommonResult
 * @Date 2020/11/3 15:14
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment  implements Serializable {
    private Long id ;
    private String serial ;
}
