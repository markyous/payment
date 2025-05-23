package com.study.payment.service;

import com.study.payment.dto.PaymentDTO;

import java.math.BigDecimal;

public interface PaymentMethodStrategy {

    void pay(BigDecimal amount);
}
