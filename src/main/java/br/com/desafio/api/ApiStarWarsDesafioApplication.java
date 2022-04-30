package br.com.desafio.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;


@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = {"br.com.desafio.api"})
@EnableAutoConfiguration
public class ApiStarWarsDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiStarWarsDesafioApplication.class, args);
	}
//
//	@Bean
//	public Jackson2ObjectMapperBuilderCustomizer jacksonObjectMapperCustomization() {
//		return jacksonObjectMapperBuilder -> jacksonObjectMapperBuilder.timeZone(TimeZone.getDefault());
//	}

	/**
	 * Configuração das propriedades de desserialização JSON do Jackson Provider.
	 *
	 * @return Jackson2ObjectMapperBuilderCustomizer
	 */
	@Bean
	public Jackson2ObjectMapperBuilderCustomizer jacksonObjectMapperCustomization() {

		return jacksonObjectMapperBuilder -> jacksonObjectMapperBuilder.timeZone(TimeZone.getDefault());
	}

	/**
	 * Configuração das propriedades das requisições REST
	 *
	 * @param restTemplateBuilder
	 * @return RestTemplate
	 */
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
//
//		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
//		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//		List<MediaType> types = Arrays.asList(new MediaType("application", "*+text", StandardCharsets.UTF_8),
//				MediaType.APPLICATION_JSON);
//
//		converter.setSupportedMediaTypes(types);
//		messageConverters.add(converter);
//
//		return restTemplateBuilder //
//				.setConnectTimeout(Duration.ofSeconds(restConnectTimeout)) //
//				.setReadTimeout(Duration.ofSeconds(restReadTimeout)) //
//				.build();
//	}
}
