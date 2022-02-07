package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudGatewayRsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayRsApplication.class, args);
	}

}
