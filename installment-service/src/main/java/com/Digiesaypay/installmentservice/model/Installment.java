package com.Digiesaypay.installmentservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "installment")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Installment {
    @Id
    private String id;
    private Float amount_available ;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date ;
    private String Status ;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date due_date ;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date payment_date ;

    private String id_payment ;

}
