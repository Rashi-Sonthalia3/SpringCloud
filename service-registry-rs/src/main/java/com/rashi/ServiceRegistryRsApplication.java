package com.rashi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryRsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryRsApplication.class, args);
	}

}
