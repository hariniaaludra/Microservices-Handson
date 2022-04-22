package com.module.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EntityScan("com.module.sales.presistence.entity")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
