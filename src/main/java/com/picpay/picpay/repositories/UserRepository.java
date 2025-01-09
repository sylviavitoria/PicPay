package com.picpay.picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.picpay.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

    
} 
    

