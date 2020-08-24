package com.app.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		
		//System.setProperty("server.port", "8081");
		SpringApplication.run(MyappApplication.class, args);
	}

}
