package com.Digiesaypay.satisfactionservice.repository;
import com.Digiesaypay.satisfactionservice.model.Satisfaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SatisfactionRepository extends MongoRepository<Satisfaction, String> {
}
