package com.study.payment.service.impl.strategy;

import com.study.payment.dto.PaymentDTO;
import com.study.payment.service.PaymentMethodStrategy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Qualifier("bankTransferPayment")
@Component
public class BankTransferPaymentMethodStrategy implements PaymentMethodStrategy {
    @Override
    public void pay(BigDecimal amount) {
//        Handle Payment with credit card
        System.out.println("Handle Payment Using Bank Transfer Payment Method Strategy");
        System.out.println("Processing Bank Transfer Payment Of $" + amount);

    }
}
