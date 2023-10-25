package com.Digiesaypay.paymentservice.dto;

import org.springframework.data.annotation.Id;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentResponse {
    @Id
    private String id;
    private Float total_amount;
    private Date payment_date;
    private Float advance_amount;
    private Float installment_amount;
    private Integer number_of_months;
    private String object;
    private Integer id_payment_method;
    private Integer id_customer ;

}
