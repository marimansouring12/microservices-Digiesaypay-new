package com.Digiesaypay.installmentservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;

import java.util.Date;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InstallmentResponse {
    @Id
    private String id;
    private Float amount_available ;
    private Date date ;
    private String Status ;
    private Date due_date ;
    private Date payment_date ;

    private String id_payment ;

}
