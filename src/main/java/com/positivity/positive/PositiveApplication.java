package com.positivity.positive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
public class PositiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(PositiveApplication.class, args);
	}

}
