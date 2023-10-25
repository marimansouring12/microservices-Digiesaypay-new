package com.Digiesaypay.satisfactionservice.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SatisfactionRequest {
    private String satisfying_content;
    private String id_customer;

}
