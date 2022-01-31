package com.examplegroupe.interiorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InteriorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InteriorServiceApplication.class, args);
	}

}
