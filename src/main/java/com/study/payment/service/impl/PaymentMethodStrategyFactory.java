package com.study.payment.service.impl;

import com.study.payment.service.PaymentMethodStrategy;
import com.study.payment.util.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class PaymentMethodStrategyFactory {

    private final Map<PaymentMethod, PaymentMethodStrategy> strategies;

    @Autowired
    public PaymentMethodStrategyFactory(
            @Qualifier("creditCardPayment") PaymentMethodStrategy creditCardPayment,
            @Qualifier("paypalPayment") PaymentMethodStrategy paypalPayment,
            @Qualifier("bankTransferPayment") PaymentMethodStrategy bankTransferPayment) {

        strategies = Map.of(
                PaymentMethod.CREDIT_CARD, creditCardPayment,
                PaymentMethod.PAYPAL, paypalPayment,
                PaymentMethod.BANK_TRANSFER, bankTransferPayment
        );
    }

    public PaymentMethodStrategy getStrategy(PaymentMethod paymentMethod) {
        return strategies.get(paymentMethod);
    }
}