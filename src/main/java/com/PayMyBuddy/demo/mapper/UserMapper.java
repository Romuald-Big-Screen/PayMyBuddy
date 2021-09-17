package com.PayMyBuddy.demo.mapper;

import org.springframework.security.core.userdetails.User;

@Mapper
public interface UserMapper extends AbstractMapper<User, UserDto>{
    @Override
    User toEntity(UserDto dto);

}
