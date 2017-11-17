package com.jetherrodrigues.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jetherrodrigues"})
public class SpringClimatempoBridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClimatempoBridgeApplication.class, args);
	}
}
