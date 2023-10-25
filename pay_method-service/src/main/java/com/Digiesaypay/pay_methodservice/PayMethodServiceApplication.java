package com.Digiesaypay.pay_methodservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayMethodServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayMethodServiceApplication.class, args);
	}

}
