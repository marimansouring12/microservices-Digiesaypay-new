package com.Digiesaypay.userservice.service;

import com.Digiesaypay.userservice.dto.UserRequest;
import com.Digiesaypay.userservice.dto.UserResponse;
import com.Digiesaypay.userservice.model.User;
import com.Digiesaypay.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository ;
    public void createUser(UserRequest userRequest){
        User user= User.builder()
                .name(userRequest.getName())
                .First_Name(userRequest.getFirst_Name())
                .Phone(userRequest.getPhone())
                .adr(userRequest.getAdr())
                .mail(userRequest.getMail())
                .password(userRequest.getPassword())
                .build() ;
        userRepository.save(user);
        log.info("User {} is saved",user.getId());
    }

    public List<UserResponse> getAllUsers() {
        List<User> users=userRepository.findAll();
        return users.stream().map(this::mapToUserResponse).toList();
    }

    private UserResponse mapToUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .First_Name(user.getFirst_Name())
                .Phone(user.getPhone())
                .adr(user.getAdr())
                .mail(user.getMail())
                .password(user.getPassword())
                .build() ;
    }
}
