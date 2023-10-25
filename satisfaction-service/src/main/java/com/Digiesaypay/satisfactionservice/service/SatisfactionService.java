package com.Digiesaypay.satisfactionservice.service;
import com.Digiesaypay.satisfactionservice.dto.SatisfactionRequest;
import com.Digiesaypay.satisfactionservice.dto.SatisfactionResponse;
import com.Digiesaypay.satisfactionservice.model.Satisfaction;
import com.Digiesaypay.satisfactionservice.repository.SatisfactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SatisfactionService {
    private final SatisfactionRepository satisfactionRepository ;
    public void createSatisfaction(SatisfactionRequest satisfactionRequest){
        Satisfaction satisfaction= Satisfaction.builder()
                .satisfying_content(satisfactionRequest.getSatisfying_content())
                .id_customer(satisfactionRequest.getId_customer())

                .build() ;
        satisfactionRepository.save(satisfaction);
        log.info("Satisfaction {} is saved",satisfaction.getId());
    }

    public List<SatisfactionResponse> getAllSatisfactions() {
        List<Satisfaction> satisfactions=satisfactionRepository.findAll();
        return satisfactions.stream().map(this::mapToSatisfactionResponse).toList();
    }

    private SatisfactionResponse mapToSatisfactionResponse(Satisfaction satisfaction) {
        return SatisfactionResponse.builder()
                .id(satisfaction.getId())
                .satisfying_content(satisfaction.getSatisfying_content())
                .id_customer(satisfaction.getId_customer())
                .build() ;
    }
}
