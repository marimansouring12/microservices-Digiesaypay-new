package com.Digiesaypay.installmentservice.controller;
import com.Digiesaypay.installmentservice.dto.InstallmentRequest;
import com.Digiesaypay.installmentservice.dto.InstallmentResponse;
import com.Digiesaypay.installmentservice.service.InstallmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/installment")
@RequiredArgsConstructor
public class InstallmentController {
    private final InstallmentService installmentService ;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPayment(@RequestBody InstallmentRequest installmentRequest) {
        installmentService.createInstallment(installmentRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InstallmentResponse> getAllInstallments(){
        return  installmentService.getAllInstallments();
    }

}
