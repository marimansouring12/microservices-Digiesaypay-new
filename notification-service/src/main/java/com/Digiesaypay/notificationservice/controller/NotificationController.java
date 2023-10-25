package com.Digiesaypay.notificationservice.controller;
import com.Digiesaypay.notificationservice.dto.NotificationRequest;
import com.Digiesaypay.notificationservice.dto.NotificationResponse;
import com.Digiesaypay.notificationservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService ;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNotification(@RequestBody NotificationRequest notificationRequest) {
        notificationService.createNotification(notificationRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<NotificationResponse> getAllNotifications(){
        return  notificationService.getAllNotifications();
    }}
