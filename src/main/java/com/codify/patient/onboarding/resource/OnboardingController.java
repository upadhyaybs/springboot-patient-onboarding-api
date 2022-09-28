package com.codify.patient.onboarding.resource;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codify.patient.onboarding.domain.Doctor;
import com.codify.patient.onboarding.domain.Hospital;
import com.codify.patient.onboarding.service.IOnboardingService;

import reactor.core.publisher.Mono;



@RestController
@RequestMapping("/onboarding")
@Tag(name = "Onboaring APIs", description = "Onboaring APIs for demo purpose")
public class OnboardingController {

	private final IOnboardingService service;
	
	public OnboardingController(IOnboardingService service) {
		this.service=service;
	}

	@PostMapping("/assignhospital/{zip}")
	public Mono<Hospital> assignHospitalToPatient(@PathVariable("zip") String zip) {
		return Mono.just(service.getParticipatingHospital(zip));
	}

	@PostMapping("/assigndoctor/{condition}")
	public Mono<Doctor> assignDoctorToPatient(@PathVariable("condition") String condition) {
		return Mono.just(service.getParticipatingDoctor(condition));
	}

	@PostMapping("/notify/{contact}")
	public Mono<Void> notifyPatient(@PathVariable("contact") String contact) {
		// do nothing here for demo...
		// irl would send email or text message or both
		return Mono.empty();
	}

}
