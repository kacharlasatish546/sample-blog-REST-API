package com.javatraining.springbootblogrestapi.service;

import com.javatraining.springbootblogrestapi.payload.LoginDto;
import com.javatraining.springbootblogrestapi.payload.RegisterDto;

public interface AuthService {

    String login(LoginDto loginDto);
    public String register(RegisterDto registerDto);

}
