package com.payment.api.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PaymentApiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApiConfigServerApplication.class, args);
	}

}
