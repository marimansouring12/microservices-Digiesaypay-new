package com.Digiesaypay.paymentservice.service;
import com.Digiesaypay.paymentservice.dto.PaymentRequest;
import com.Digiesaypay.paymentservice.dto.PaymentResponse;
import com.Digiesaypay.paymentservice.model.Payment;
import com.Digiesaypay.paymentservice.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentService {

    private final PaymentRepository paymentRepository ;
    public void createPayment(PaymentRequest paymentRequest){
        Payment payment= Payment.builder()
                .total_amount(paymentRequest.getTotal_amount())
                .payment_date(paymentRequest.getPayment_date())
                .advance_amount(paymentRequest.getAdvance_amount())
                .installment_amount(paymentRequest.getInstallment_amount())
                .number_of_months(paymentRequest.getNumber_of_months())
                .object(paymentRequest.getObject())
                .id_payment_method(paymentRequest.getId_payment_method())
                .id_customer(paymentRequest.getId_customer())
                .build() ;
        paymentRepository.save(payment);
        log.info("Payment {} is saved",payment.getId());
    }

    public List<PaymentResponse> getAllPayments() {
        List<Payment> users=paymentRepository.findAll();
        return users.stream().map(this::mapToPaymentResponse).toList();
    }

    private PaymentResponse mapToPaymentResponse(Payment payment) {
        return PaymentResponse.builder()
                .total_amount(payment.getTotal_amount())
                .payment_date(payment.getPayment_date())
                .advance_amount(payment.getAdvance_amount())
                .installment_amount(payment.getInstallment_amount())
                .number_of_months(payment.getNumber_of_months())
                .object(payment.getObject())
                .id_payment_method(payment.getId_payment_method())
                .id_customer(payment.getId_customer())
                .build() ;
    }
}
