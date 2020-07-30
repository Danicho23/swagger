package com.M5A.ista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class IstaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IstaApplication.class, args);
	}

}
