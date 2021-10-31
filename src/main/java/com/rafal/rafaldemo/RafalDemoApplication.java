package com.rafal.rafaldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@EnableJpaRepositories("com.rafal.rafaldemo.persistence.repo") 
@EntityScan("com.rafal.rafaldemo.persistence.model")
@SpringBootApplication(scanBasePackages = "com.rafal.rafaldemo")
public class RafalDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RafalDemoApplication.class, args);
	}

}