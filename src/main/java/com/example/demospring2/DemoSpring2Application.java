package com.example.demospring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class DemoSpring2Application {

	public static void main(String[] args) {
		System.out.println("Hello there!");
		SpringApplication.run(DemoSpring2Application.class, args);
	}
}
