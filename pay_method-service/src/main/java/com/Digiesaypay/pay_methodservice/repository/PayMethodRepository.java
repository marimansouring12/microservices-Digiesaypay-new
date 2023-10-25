package com.Digiesaypay.pay_methodservice.repository;

import com.Digiesaypay.pay_methodservice.model.PayMethod;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PayMethodRepository extends MongoRepository<PayMethod, String> {

}
