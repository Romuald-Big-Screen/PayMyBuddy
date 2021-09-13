package com.PayMyBuddy.demo.service.FORM;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(User user);

    User findUser();
}
