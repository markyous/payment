package com.study.payment.service;

import com.study.payment.dto.PaymentDTO;

public interface PaymentMethodStrategy {

    void handlePaymentMethodPayment(PaymentDTO paymentDTO);
}
