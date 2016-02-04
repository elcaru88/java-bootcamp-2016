package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.finalproject.model.User;

@SpringBootApplication
@ComponentScan(basePackages = { "com.finalproject.controller", "com.finalproject.service" })
@EnableJpaRepositories("com.finalproject.dao")
@EntityScan(basePackageClasses = { User.class })
public class FinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}
}
