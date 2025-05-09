package com.primeiroprojeto.first_spring_app;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// @Configuration //define que a classe pode ter metodos que define bens
// @EnableAutoConfiguration //ativa autoconfig do spring
// @ComponentScan //permite que o spring escaneie o pacte em busca das coisas necessarias e fazer o gerenciamento dessas dependencias

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
