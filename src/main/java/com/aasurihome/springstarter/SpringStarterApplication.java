package com.aasurihome.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStarterApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringStarterApplication.class, args);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.message();
	}

}
