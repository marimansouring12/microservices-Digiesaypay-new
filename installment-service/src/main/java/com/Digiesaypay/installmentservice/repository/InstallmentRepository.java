package com.Digiesaypay.installmentservice.repository;
import com.Digiesaypay.installmentservice.model.Installment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InstallmentRepository extends MongoRepository<Installment, String> {
}

