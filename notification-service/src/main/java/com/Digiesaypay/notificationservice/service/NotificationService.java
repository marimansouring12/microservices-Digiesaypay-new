package com.Digiesaypay.notificationservice.service;
import com.Digiesaypay.notificationservice.dto.NotificationRequest;
import com.Digiesaypay.notificationservice.dto.NotificationResponse;
import com.Digiesaypay.notificationservice.model.Notification;
import com.Digiesaypay.notificationservice.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {
    private final NotificationRepository notificationRepository ;
    public void createNotification(NotificationRequest notificationRequest){
        Notification notification= Notification.builder()
                .customer_status(notificationRequest.getCustomer_status())
                .time(notificationRequest.getTime())
                .number_of_time_units(notificationRequest.getNumber_of_time_units())
                .unit_of_time(notificationRequest.getUnit_of_time())
                .message_parameter(notificationRequest.getMessage_parameter())
                .notification_message_text(notificationRequest.getNotification_message_text())
                .id_customer(notificationRequest.getId_customer())
                .build() ;
        notificationRepository.save(notification);
        log.info("Notification {} is saved",notification.getId());
    }

    public List<NotificationResponse> getAllNotifications() {
        List<Notification> notifications=notificationRepository.findAll();
        return notifications.stream().map(this::mapToNotificationResponse).toList();
    }

    private NotificationResponse mapToNotificationResponse(Notification notification) {
        return NotificationResponse.builder()
                .customer_status(notification.getCustomer_status())
                .time(notification.getTime())
                .number_of_time_units(notification.getNumber_of_time_units())
                .unit_of_time(notification.getUnit_of_time())
                .message_parameter(notification.getMessage_parameter())
                .notification_message_text(notification.getNotification_message_text())
                .id_customer(notification.getId_customer())
                .build() ;
    }
}
