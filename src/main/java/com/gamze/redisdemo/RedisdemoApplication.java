package com.gamze.redisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RedisdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisdemoApplication.class, args);
	}

}
