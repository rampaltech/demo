package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("Name: " + args[0]);
		System.out.println(System.getProperty("MY_VARIABLE"));
		SpringApplication.run(DemoApplication.class, args);
	}

}
