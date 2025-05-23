package com.study.payment.api;

import com.study.payment.dto.PaymentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/payment")
public interface PaymentAPI {

    @PostMapping("/credit-card")
    ResponseEntity<String> makeCreditCardPayment(@RequestBody PaymentDTO paymentDTO);


    @PostMapping("/paypal")
    ResponseEntity<String> makePaypalPayment(@RequestBody PaymentDTO paymentDTO);

    @PostMapping("/bank-transfer")
    ResponseEntity<String> makeBankTransferPayment(@RequestBody PaymentDTO paymentDTO);

}
