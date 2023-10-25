package com.Digiesaypay.satisfactionservice.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "satisfaction")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Satisfaction {
    @Id
    private String id;
    private String satisfying_content;
    private String id_customer;
}
