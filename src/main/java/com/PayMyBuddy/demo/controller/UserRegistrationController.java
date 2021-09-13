package com.PayMyBuddy.demo.controller;

import com.PayMyBuddy.demo.service.FORM.BankService;
import com.PayMyBuddy.demo.service.FORM.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    @Autowired
    private UserService userService;

    @Autowired
    private BankService bankService;

    private final UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    @ModelAttribute("user")
    public UserDto userRegistrationDto() {
        return new UserDto();


}
