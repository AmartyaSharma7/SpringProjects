package com.prsnlproject.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username,String password){
        
        boolean isValidUsername = username.equalsIgnoreCase("Amartya");
        boolean isValidPassword = password.equalsIgnoreCase("okay");

        return isValidPassword && isValidUsername;
    }
}
