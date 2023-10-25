package com.Digiesaypay.messageservice.service;
import com.Digiesaypay.messageservice.dto.MessageRequest;
import com.Digiesaypay.messageservice.dto.MessageResponse;
import com.Digiesaypay.messageservice.model.Message;
import com.Digiesaypay.messageservice.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageService {
    private final MessageRepository messageRepository ;
    public void createmessage(MessageRequest messageRequest){
        Message message= Message.builder()
                .picture(messageRequest.getPicture())
                .description(messageRequest.getDescription())
                .build() ;
        messageRepository.save(message);
        log.info("Message {} is saved",message.getId());
    }

    public List<MessageResponse> getAllMessages() {
        List<Message> messages=messageRepository.findAll();
        return messages.stream().map(this::mapToMessageResponse).toList();
    }

    private MessageResponse mapToMessageResponse(Message message) {
        return MessageResponse.builder()
                .id(message.getId())
                .picture(message.getPicture())
                .description(message.getDescription())
                .build() ;
    }
}
