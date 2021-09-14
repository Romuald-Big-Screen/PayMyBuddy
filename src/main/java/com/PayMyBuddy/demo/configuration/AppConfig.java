package com.PayMyBuddy.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AppConfig extends WebSecurityConfigurerAdapter {

  /*  @Bean
    public PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder(); }

    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/Register.css","/index")
                .permitAll()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/index")
                .defaultSuccessUrl("/",true)
                .and()
                .httpBasic();



    }

   */
}
