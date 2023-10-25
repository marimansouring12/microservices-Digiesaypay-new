package com.Digiesaypay.userservice.repository;

import com.Digiesaypay.userservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
