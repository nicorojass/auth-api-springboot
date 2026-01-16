package com.auth.app.auth_api_springboot.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth.app.auth_api_springboot.dtos.AuthResponse;
import com.auth.app.auth_api_springboot.dtos.LoginRequest;
import com.auth.app.auth_api_springboot.dtos.RegisterRequest;
import com.auth.app.auth_api_springboot.models.Role;
import com.auth.app.auth_api_springboot.models.User;
import com.auth.app.auth_api_springboot.repositories.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepo;
    private final PasswordEncoder passwordEncoder;

    public void register(RegisterRequest request){
        
        if (userRepo.existsByEmail(request.getEmail())){
            throw new IllegalArgumentException("Ya existe una cuenta con ese email");
        }

        User newUser = new User();
        newUser.setEmail(request.getEmail());
        newUser.setPassword(passwordEncoder.encode(request.getPassword()));
        newUser.setRole(Role.USER);

        userRepo.save(newUser);
    }

    public AuthResponse login(LoginRequest request){
        
        User user = userRepo.findByEmail(request.getEmail()).orElseThrow(() -> new IllegalArgumentException("Credenciales invalidas"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())){
            throw new IllegalArgumentException("Credenciales invalidas");
        }

        String fakeToken = "JWT_TOKEN_TEMPORAL";

        return new AuthResponse(fakeToken);
    }


}
