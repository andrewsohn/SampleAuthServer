package com.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Sample application for Authentication with JWT Tokens
 * 
 * @author andrewsohn
 *
 * Oct 24, 2016
 */
@SpringBootApplication
@EnableConfigurationProperties
public class SampleAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleAuthServerApplication.class, args);
	}
}