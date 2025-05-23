package com.study.payment.service.impl.strategy;

import com.study.payment.dto.PaymentDTO;
import com.study.payment.service.PaymentMethodStrategy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("paypalPayment")
@Component
public class PaypalPaymentMethodStrategy implements PaymentMethodStrategy {
    @Override
    public void handlePaymentMethodPayment(PaymentDTO paymentDTO) {
//        Handle Payment with credit card
        System.out.println("Handle Payment Using Paypal Payment Method Strategy");
        System.out.println("Processing Paypal Payment Of $" + paymentDTO.getAmount());


    }
}
