package com.auth.app.auth_api_springboot.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.app.auth_api_springboot.dtos.AuthResponse;
import com.auth.app.auth_api_springboot.dtos.LoginRequest;
import com.auth.app.auth_api_springboot.dtos.RegisterRequest;
import com.auth.app.auth_api_springboot.services.AuthService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest request){
        authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login (@RequestBody LoginRequest request){
        return authService.login(request);
    }

}
