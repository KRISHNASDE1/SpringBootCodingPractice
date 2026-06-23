package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

//
//		HelloController helloController = new HelloController();
//		 String s1 = helloController.hello();
//		System.out.println("The Spring boot Application run : " + s1);
	}

}
