package com.example.springsecuritypractice.security_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class NewSecurityConfig {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    private NewAuthenticationProvider newAuthenticationProvider;
    @Bean
    public AuthenticationManager authManager(HttpSecurity http, PasswordEncoder passwordEncoder) throws Exception{
        return http.getSharedObject(AuthenticationManagerBuilder.class).authenticationProvider(newAuthenticationProvider).build();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.httpBasic();
        http.authorizeRequests().anyRequest().authenticated();
        return http.build();
    }
}
