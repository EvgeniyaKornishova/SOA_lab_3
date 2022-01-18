package ru.ifmo.soa.lab3.primaryBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PrimaryBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimaryBackApplication.class, args);
	}

}
