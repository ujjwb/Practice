package com.practice.org.SpringPractice2;

import entity.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Newer {
    @Bean
    public Hello helloBeaan(){
        return new Hello();
    }
}
