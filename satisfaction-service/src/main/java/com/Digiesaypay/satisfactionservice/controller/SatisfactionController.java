package com.Digiesaypay.satisfactionservice.controller;
import com.Digiesaypay.satisfactionservice.dto.SatisfactionRequest;
import com.Digiesaypay.satisfactionservice.dto.SatisfactionResponse;
import com.Digiesaypay.satisfactionservice.service.SatisfactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/satisfaction")
@RequiredArgsConstructor
public class SatisfactionController {

    private final SatisfactionService satisfactionService ;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody SatisfactionRequest satisfactionRequest) {
        satisfactionService.createSatisfaction(satisfactionRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SatisfactionResponse> getAllSatisfactions(){
        return  satisfactionService.getAllSatisfactions();
    }
}
