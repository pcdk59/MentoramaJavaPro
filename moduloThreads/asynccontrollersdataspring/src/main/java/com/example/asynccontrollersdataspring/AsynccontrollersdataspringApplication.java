package com.example.asynccontrollersdataspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.asynccontrollersdataspring"})//mais simplificado ja englobando tudo
@EnableAsync
public class AsynccontrollersdataspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsynccontrollersdataspringApplication.class, args);
	}

}
