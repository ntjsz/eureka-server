package com.example.eurekaserver0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer0Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServer0Application.class)
				.web(WebApplicationType.SERVLET)
				.run(args);
		//SpringApplication.run(EurekaServer0Application.class, args);
	}

}
