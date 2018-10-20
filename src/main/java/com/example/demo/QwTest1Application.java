package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QwTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(QwTest1Application.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}
