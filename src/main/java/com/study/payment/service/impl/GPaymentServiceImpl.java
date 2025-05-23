package com.study.payment.service.impl;

import com.study.payment.dto.PaymentDTO;
import com.study.payment.service.PaymentService;
import com.study.payment.service.PaymentMethodStrategy;
import com.study.payment.util.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("GOOD")
@Service
public class GPaymentServiceImpl implements PaymentService {

    @Autowired PaymentMethodStrategyFactory paymentMethodStrategyFactory;


    @Override
    public void makePayment(PaymentMethod paymentMethod , PaymentDTO paymentDTO) {
        System.out.println("Payment Start");
        System.out.println("Check User Data");
        System.out.println("Check Payment Data");
        PaymentMethodStrategy strategy = paymentMethodStrategyFactory.getStrategy(paymentMethod);
        if (strategy == null) {
            throw new IllegalArgumentException("No strategy found for payment method: " + paymentMethod);
        }
        strategy.pay(paymentDTO.getAmount());
        System.out.println("Set Payment Successes");

    }
}
