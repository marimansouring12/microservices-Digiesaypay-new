package com.Digiesaypay.installmentservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InstallmentRequest {
    private Float amount_available ;
    private Date date ;
    private String Status ;
    private Date due_date ;
    private Date payment_date ;

    private String id_payment ;
}
