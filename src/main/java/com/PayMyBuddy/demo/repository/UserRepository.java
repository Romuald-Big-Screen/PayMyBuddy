package com.PayMyBuddy.demo.repository;


import com.PayMyBuddy.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
