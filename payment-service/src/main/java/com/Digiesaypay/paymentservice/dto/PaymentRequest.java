package com.Digiesaypay.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentRequest {
    private Float total_amount;
    private Date payment_date;
    private Float advance_amount;
    private Float installment_amount;
    private Integer number_of_months;
    private String object;
    private Integer id_payment_method;
    private Integer id_customer ;

}
