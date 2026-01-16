package com.auth.app.auth_api_springboot.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.app.auth_api_springboot.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

}
