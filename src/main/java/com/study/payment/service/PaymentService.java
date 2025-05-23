package com.study.payment.service;

import com.study.payment.dto.PaymentDTO;
import com.study.payment.util.PaymentMethod;

public interface PaymentService {

    void makePayment(PaymentMethod paymentMethod , PaymentDTO paymentDTO);
}
