package com.codify.patient.onboarding;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Patient Onboaring APIs", version = "1.0", description = "Developed using Spring Boot"))
public class PatientOnboardingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientOnboardingServiceApplication.class, args);
	}

}
