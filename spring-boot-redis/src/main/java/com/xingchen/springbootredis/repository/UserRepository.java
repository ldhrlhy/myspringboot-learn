package com.xingchen.springbootredis.repository;

import com.xingchen.springbootredis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
