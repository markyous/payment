package com.study.payment.controller;


import com.study.payment.api.PaymentAPI;
import com.study.payment.dto.PaymentDTO;
import com.study.payment.service.PaymentService;
import com.study.payment.util.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController implements PaymentAPI {

    @Autowired
    @Qualifier("GOOD")
    PaymentService paymentService;


    @Override
    public ResponseEntity<String> makeCreditCardPayment(PaymentDTO paymentDTO) {
        paymentService.makePayment(PaymentMethod.CREDIT_CARD, paymentDTO);
        return ResponseEntity.ok("Success");
    }

    @Override
    public ResponseEntity<String> makePaypalPayment(PaymentDTO paymentDTO) {
        paymentService.makePayment(PaymentMethod.PAYPAL, paymentDTO);
        return ResponseEntity.ok("Success");
    }

    @Override
    public ResponseEntity<String> makeBankTransferPayment(PaymentDTO paymentDTO) {
        paymentService.makePayment(PaymentMethod.BANK_TRANSFER, paymentDTO);
        return ResponseEntity.ok("Success");
    }
}
