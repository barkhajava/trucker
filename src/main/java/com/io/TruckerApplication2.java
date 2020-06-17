package com.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.io.repository")
@SpringBootApplication
public class TruckerApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(TruckerApplication2.class, args);
	}

}
