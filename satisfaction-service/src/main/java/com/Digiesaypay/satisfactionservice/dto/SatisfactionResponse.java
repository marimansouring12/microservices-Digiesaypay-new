package com.Digiesaypay.satisfactionservice.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SatisfactionResponse {
    @Id
    private String id;
    private String satisfying_content;
    private String id_customer;

}
