package com.practice.org.SpringPractice2;

import entity.Greeting;
import entity.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan("/entity")
public class SpringPractice2Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Newer.class);
		//System.out.println(Arrays.stream(args).findAny().get());
		 Greeting h=context.getBean(Greeting.class);
		 System.out.println(h);
	}

}
