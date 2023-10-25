package com.Digiesaypay.messageservice.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageResponse {
    @Id
    private String id;
    private String picture;
    private String description;
}
