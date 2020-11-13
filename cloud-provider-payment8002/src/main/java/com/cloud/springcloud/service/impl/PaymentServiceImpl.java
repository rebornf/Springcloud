package com.cloud.springcloud.service.impl; /**
 * Created with IntelliJ IDEA By fty on 2020/11/3
 */

import com.cloud.springcloud.dao.PaymentDao;
import com.cloud.springcloud.entities.Payment;
import com.cloud.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/11/3 19:41
 * @Version V1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao ;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
