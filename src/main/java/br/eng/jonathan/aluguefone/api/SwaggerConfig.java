package br.eng.jonathan.aluguefone.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket aluguefoneApi() {
		return new Docket (DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(Metadata());
	}

	private ApiInfo Metadata() {
		return new ApiInfoBuilder()
				.title("Exercício Spring Boot Rest API")
				.description("\"Spring Boot REST API para alugueFone\"")
				.version("1.0.0")
				.license("License by Jonathan Nascimento")
				.licenseUrl("https://www.jonathan.eng.br")
		        .build();
	}

}
