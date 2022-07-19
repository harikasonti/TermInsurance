package com.capgemini.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TermInsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TermInsuranceApplication.class, args);
	}

}
