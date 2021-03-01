package com.accp.controller;


import com.accp.domain.Payment;
import com.accp.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    IPaymentService paymentService;

    public Payment findById(int paymentid){
        return paymentService.getById(paymentid);
    }

    @RequestMapping("find")
    public List<Payment> find(){
        return paymentService.list();
    }
}

