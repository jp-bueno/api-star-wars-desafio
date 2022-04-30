package br.com.desafio.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ApiStarWarsDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiStarWarsDesafioApplication.class, args);
	}

}
