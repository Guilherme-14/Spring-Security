package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Avaliacao2Application {

	public static void main(String[] args) {
		SpringApplication.run(Avaliacao2Application.class, args);
	}

}
