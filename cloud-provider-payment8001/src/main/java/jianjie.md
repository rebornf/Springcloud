业务代码写的流程(以支付接口)
===
##cloud-provider-payment8001
* 修改pom 
* 写yml  
* 主启动 
* 业务类
    * 1 建表SQL
    * 2 entities    
        >主实体Payment
        >Json封装体CommenResult
    * 3 dao
    * 4 service
        >接口PaymentService
        >实现类            
    * 5 controller
* 测试
* 热部署Devtools