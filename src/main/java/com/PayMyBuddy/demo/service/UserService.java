package com.PayMyBuddy.demo.service;

import com.PayMyBuddy.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

/*
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User registration (final RegistrationForm form){
        User user = new User();
        userRepository.save()
    }

 */
}
