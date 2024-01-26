package com.example.keiken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class KeikenApplication {
	public static void main(String[] args) {
		SpringApplication.run(KeikenApplication.class, args);
	}
}