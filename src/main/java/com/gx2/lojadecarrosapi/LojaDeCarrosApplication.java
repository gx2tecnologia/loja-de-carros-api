package com.gx2.lojadecarrosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LojaDeCarrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaDeCarrosApplication.class, args);
	}
}
