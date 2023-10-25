package com.Digiesaypay.paymentservice.repository;
import com.Digiesaypay.paymentservice.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
