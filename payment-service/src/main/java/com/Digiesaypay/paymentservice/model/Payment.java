package com.Digiesaypay.paymentservice.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document(value = "payment")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Payment {
    @Id
    private String id;
    private Float total_amount;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date payment_date;
    private Float advance_amount;
    private Float installment_amount;
    private Integer number_of_months;
    private String object;
    private Integer id_payment_method;
    private Integer id_customer ;
}