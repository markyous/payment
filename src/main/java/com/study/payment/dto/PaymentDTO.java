package com.study.payment.dto;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class PaymentDTO {

    int userId;
    int paymentId;
    BigDecimal amount;
}
