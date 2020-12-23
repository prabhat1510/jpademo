package com.training.springboot.jpa.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.training.springboot.jpa.jpademo")
@EnableJpaAuditing
@EnableJpaRepositories(basePackages="com.training.springboot.jpa.jpademo.dao")
@EntityScan("com.training.springboot.jpa.jpademo.model")
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

}
