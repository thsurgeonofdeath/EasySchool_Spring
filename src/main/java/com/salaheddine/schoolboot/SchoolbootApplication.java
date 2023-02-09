package com.salaheddine.schoolboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.salaheddine.schoolboot.repository")
@EntityScan("com.salaheddine.schoolboot.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class SchoolbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(SchoolbootApplication.class, args);
	}
}
