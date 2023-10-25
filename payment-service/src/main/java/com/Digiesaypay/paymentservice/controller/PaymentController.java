package com.Digiesaypay.paymentservice.controller;
import com.Digiesaypay.paymentservice.dto.PaymentRequest;
import com.Digiesaypay.paymentservice.dto.PaymentResponse;
import com.Digiesaypay.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService ;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPayment(@RequestBody PaymentRequest paymentRequest) {
        paymentService.createPayment(paymentRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PaymentResponse> getAllPayments(){
        return  paymentService.getAllPayments();
    }

}
