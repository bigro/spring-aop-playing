package com.example.springaopplaying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringAopPlayingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopPlayingApplication.class, args);
	}

}
