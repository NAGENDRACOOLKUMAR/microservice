package com.company.account;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Account microservice REST API Documentation",
				description = "Ezybank account microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Nagendra kumar",
						email = "nagendrakumar5612@gmail.com",
						url =  "https://www.nagenedrakumar.com"

				),
				license = @License(
						name= "apache 2",
						url = "https://www.nagendrakumar.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "EzyBank Accounts microservice REST API Documentation",
				url = "https://www.eazybytes.com/swagger-ui.html"
		)

)
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
