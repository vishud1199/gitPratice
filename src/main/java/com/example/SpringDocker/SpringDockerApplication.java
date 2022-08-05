package com.example.SpringDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@SpringBootApplication
public class SpringDockerApplication {

	@GetMapping("/msg")
	public String getMessage(){

		return"welcome to my docker application";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);

	}



}
