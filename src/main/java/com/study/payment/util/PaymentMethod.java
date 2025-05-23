package com.study.payment.util;

import java.util.Arrays;

public enum PaymentMethod {
    CREDIT_CARD("credit-card"),
    PAYPAL("paypal"),
    BANK_TRANSFER("bank-transfer");

    private final String code;

    PaymentMethod(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static PaymentMethod fromCode(String code) {
        return Arrays.stream(values())
                .filter(pm -> pm.getCode().equals(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown payment method: " + code));
    }
}