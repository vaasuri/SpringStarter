package com.aasurihome.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStarterApplication {
	
	public static void main(String[] args) {
		/*
		 * SpringApplication#run bootstraps a spring application as a stand-alone application
		 * from the main method. It creates an appropriate ApplicationContext instance and
		 * loads beans. It also runs embedded TomCat Server in a Spring web application.
		 */
		ApplicationContext context = SpringApplication.run(SpringStarterApplication.class, args);
		
		/*
		 * Here is an example where we fetch an instance of HelloWorld using the ApplicationContext object.
		 */
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.message();		
	}

}
