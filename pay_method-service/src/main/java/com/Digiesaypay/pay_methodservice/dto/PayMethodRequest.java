package com.Digiesaypay.pay_methodservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayMethodRequest {
    private Integer number_of_Installments;
    private String installmentUnit;
}
