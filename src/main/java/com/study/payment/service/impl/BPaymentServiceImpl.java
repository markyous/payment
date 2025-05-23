package com.study.payment.service.impl;

import com.study.payment.dto.PaymentDTO;
import com.study.payment.service.PaymentService;
import com.study.payment.service.PaymentMethodStrategy;
import com.study.payment.util.PaymentMethod;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("BAD")
@Service
public class BPaymentServiceImpl implements PaymentService {

    PaymentMethodStrategy paymentMethodStrategy;



    @Override
    public void makePayment(PaymentMethod paymentMethod , PaymentDTO paymentDTO) {
        System.out.println("Payment Start");
        System.out.println("Check User Data");
        System.out.println("Check Payment Data");

        if(paymentMethod == PaymentMethod.CREDIT_CARD){
            System.out.println("Handle Payment Using Credit Card Payment Method Strategy");
            System.out.println("Processing Credit Card Payment Of $" + paymentDTO.getAmount());

        }else if(paymentMethod == PaymentMethod.PAYPAL){
            System.out.println("Handle Payment Using Paypal Payment Method Strategy");
            System.out.println("Processing Paypal Payment Of $" + paymentDTO.getAmount());

        }else if(paymentMethod == PaymentMethod.BANK_TRANSFER){
            System.out.println("Handle Payment Using Bank Transfer Payment Method Strategy");
            System.out.println("Processing Bank Transfer Payment Of $" + paymentDTO.getAmount());

        }

        System.out.println("Set Payment Successes");

    }
}
