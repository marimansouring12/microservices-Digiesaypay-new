package com.Digiesaypay.pay_methodservice.controller;

import com.Digiesaypay.pay_methodservice.PayMethodServiceApplication;
import com.Digiesaypay.pay_methodservice.dto.PayMethodRequest;
import com.Digiesaypay.pay_methodservice.dto.PayMethodResponse;
import com.Digiesaypay.pay_methodservice.service.PayMethodService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/paymethod")
@RequiredArgsConstructor
@Slf4j
public class PayMethodController {
    private final PayMethodService paymethodService ;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
        public String createMethod(@RequestBody PayMethodRequest paymethodrequest){
        paymethodService.createMethod(paymethodrequest);
            return "Method Added Successfully";
        }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PayMethodResponse> getAllMethods(){
        return  paymethodService.getAllMethods();
    }
}
