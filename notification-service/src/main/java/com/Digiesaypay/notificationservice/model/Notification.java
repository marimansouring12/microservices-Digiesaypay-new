package com.Digiesaypay.notificationservice.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "notification")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Notification {
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
