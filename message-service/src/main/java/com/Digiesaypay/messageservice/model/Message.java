package com.Digiesaypay.messageservice.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "message")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Message {
    @Id
    private String id;
    private String picture;
    private String description;
}
