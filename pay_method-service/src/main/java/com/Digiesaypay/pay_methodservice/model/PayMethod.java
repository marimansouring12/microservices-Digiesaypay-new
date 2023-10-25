package com.Digiesaypay.pay_methodservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(value = "paymethod")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class PayMethod {
    @Id
    private String id;
    private Integer number_of_Installments;
    private String installmentUnit;


}
