package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
	}

}
