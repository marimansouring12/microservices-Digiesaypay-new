package com.Digiesaypay.notificationservice.repository;

import com.Digiesaypay.notificationservice.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
