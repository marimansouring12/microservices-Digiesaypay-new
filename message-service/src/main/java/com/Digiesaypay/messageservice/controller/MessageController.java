package com.Digiesaypay.messageservice.controller;
import com.Digiesaypay.messageservice.dto.MessageRequest;
import com.Digiesaypay.messageservice.dto.MessageResponse;
import com.Digiesaypay.messageservice.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/message")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService ;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createMessage(@RequestBody MessageRequest messageRequest) {
        messageService.createmessage(messageRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MessageResponse> getAllMessages(){
        return  messageService.getAllMessages();
    }
}
