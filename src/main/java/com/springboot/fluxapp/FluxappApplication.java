package com.springboot.fluxapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.nio.file.Path;

@SpringBootApplication
public class FluxappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FluxappApplication.class, args);
	}

}
