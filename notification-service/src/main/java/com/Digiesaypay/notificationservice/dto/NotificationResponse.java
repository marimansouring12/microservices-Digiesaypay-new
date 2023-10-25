package com.Digiesaypay.notificationservice.dto;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationResponse {
    @Id
    private String id;
    private String customer_status ;

    private String time ;
    private Integer number_of_time_units;
    private String unit_of_time ;
    private String message_parameter;
    private String notification_message_text;
    private String id_customer ;
}
