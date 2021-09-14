package com.PayMyBuddy.demo.controller;

import com.PayMyBuddy.demo.service.UserService;
import com.PayMyBuddy.demo.service.form.RegistrationForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private final UserService userservice;

    public UserController(UserService userservice) {
        this.userservice = userservice;
    }

    /*
        @RequestMapping(value = "registration", method = RequestMethod.POST)
        public ModelAndView listeEmails(@ModelAttribute(name = "registrationForm") RegistrationForm form) {
            userservice.registration(form);
            return new ModelAndView("login", "loginForm", new LoginForm());

        }

     */
    @GetMapping("/register")
    public ModelAndView RegisterForm() {

        return new ModelAndView("register", "registrationForm", new RegistrationForm());

    }
}
