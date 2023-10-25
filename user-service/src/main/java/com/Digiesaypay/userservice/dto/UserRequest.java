package com.Digiesaypay.userservice.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    private String name;
    private String First_Name;
    private String Phone;
    private String adr ;
    private String mail ;
    private String password;
}
