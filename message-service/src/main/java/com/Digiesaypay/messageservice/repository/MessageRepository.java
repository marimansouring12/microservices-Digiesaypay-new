package com.Digiesaypay.messageservice.repository;

import com.Digiesaypay.messageservice.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}
