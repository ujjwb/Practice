package com.example.springsecuritypractice.security_config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
@Component
public class NewAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name=authentication.getName();
        String password= authentication.getCredentials().toString();
        if("ujjwb".equals(name) && "test".equals(password)){
            return new UsernamePasswordAuthenticationToken(name,password, Arrays.asList());
        }
        else{
            throw new BadCredentialsException("Invalid Username or Password");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
