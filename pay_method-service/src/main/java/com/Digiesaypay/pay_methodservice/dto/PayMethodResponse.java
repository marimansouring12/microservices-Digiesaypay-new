package com.Digiesaypay.pay_methodservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayMethodResponse {
    @Id
    private String id;
    private Integer number_of_Installments;
    private String installmentUnit;

}
