package com.Digiesaypay.installmentservice.service;
import com.Digiesaypay.installmentservice.dto.InstallmentRequest;
import com.Digiesaypay.installmentservice.dto.InstallmentResponse;
import com.Digiesaypay.installmentservice.model.Installment;
import com.Digiesaypay.installmentservice.repository.InstallmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class InstallmentService {
    private final InstallmentRepository installmentRepository ;
    public void createInstallment(InstallmentRequest installmentRequest){
        Installment installment= Installment.builder()
                .amount_available(installmentRequest.getAmount_available())
                .date(installmentRequest.getDate())
                .Status(installmentRequest.getStatus())
                .due_date(installmentRequest.getDue_date())
                .payment_date(installmentRequest.getPayment_date())
                .id_payment(installmentRequest.getId_payment())
                .build() ;
        installmentRepository.save(installment);
        log.info("Installment {} is saved",installment.getId());
    }

    public List<InstallmentResponse> getAllInstallments() {
        List<Installment> installments=installmentRepository.findAll();
        return installments.stream().map(this::mapToInstallmentResponse).toList();
    }

    private InstallmentResponse mapToInstallmentResponse(Installment installment) {
        return InstallmentResponse.builder()
                .amount_available(installment.getAmount_available())
                .date(installment.getDate())
                .Status(installment.getStatus())
                .due_date(installment.getDue_date())
                .payment_date(installment.getPayment_date())
                .id_payment(installment.getId_payment())
                .build() ;
    }
}
