package com.baeldung.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@EnableJpaRepositories("com.baeldung.app.repository")
@EntityScan("com.baeldung.app.model")
@SpringBootApplication
public class BaeldungAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaeldungAppApplication.class, args);
	}

}
