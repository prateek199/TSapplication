package com.dinesh.tatasky;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class TataskyApplication {
	private static final Logger logger = LoggerFactory.getLogger(TataskyApplication.class);

	public static void main(String[] args) {
		 logger.info("this is the application class");
		SpringApplication.run(TataskyApplication.class, args);
	}

}
