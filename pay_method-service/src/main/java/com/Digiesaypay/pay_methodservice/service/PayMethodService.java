package com.Digiesaypay.pay_methodservice.service;
import com.Digiesaypay.pay_methodservice.dto.PayMethodRequest;
import com.Digiesaypay.pay_methodservice.dto.PayMethodResponse;
import com.Digiesaypay.pay_methodservice.model.PayMethod;
import com.Digiesaypay.pay_methodservice.repository.PayMethodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class PayMethodService {
    private final PayMethodRepository payMethodRepository ;
    public  void createMethod(PayMethodRequest payMethodRequest) {
        PayMethod payMethod= PayMethod.builder()
                .number_of_Installments(payMethodRequest.getNumber_of_Installments())
                .installmentUnit(payMethodRequest.getInstallmentUnit())
                .build() ;
        payMethodRepository.save(payMethod);
        log.info("Payment Method  {} is saved",payMethod.getId());

    }
    public List<PayMethodResponse> getAllMethods() {
        List<PayMethod> methods=payMethodRepository.findAll();
        return methods.stream().map(this::mapToPayMethodResponse).toList();
    }

    private PayMethodResponse mapToPayMethodResponse(PayMethod payMethod) {
        return PayMethodResponse.builder()
                .number_of_Installments(payMethod.getNumber_of_Installments())
                .installmentUnit(payMethod.getInstallmentUnit())
                .build() ;
    }
}
