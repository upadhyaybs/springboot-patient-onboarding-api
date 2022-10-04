package com.codify.patient.onboarding.resource;

import com.codify.patient.onboarding.domain.Request;
import com.codify.patient.onboarding.domain.Response;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import com.codify.patient.onboarding.service.IOnboardingService;

import reactor.core.publisher.Mono;


@Slf4j
@RestController
@RequestMapping("/onboarding")
@Tag(name = "Onboaring APIs", description = "Onboaring APIs for demo purpose")
public class OnboardingController {

	private final IOnboardingService service;
	
	public OnboardingController(IOnboardingService service) {
		this.service=service;
	}

	@PostMapping("/assignhospital/{zip}")
	public Mono<Response> assignHospitalToPatient(@RequestBody Request request, @PathVariable("zip") String zip) {
		log.info("Request : " +request + " | zip :" +zip);
		return Mono.just(Response.builder().correlationId(request.getCorrelationId()).businessKey(request.getBusinessKey()).id(request.getId()).hospital(service.getParticipatingHospital(zip)).build());
	}

	@PostMapping("/assigndoctor/{condition}")
	public Mono<Response> assignDoctorToPatient(@RequestBody Request request,@PathVariable("condition") String condition) {
		log.info("Request : " +request + " | condition :" +condition);
		return Mono.just(Response.builder().correlationId(request.getCorrelationId()).businessKey(request.getBusinessKey()).id(request.getId()).doctor(service.getParticipatingDoctor(condition)).build());
	}

	@PostMapping("/notify/{contact}")
	public Mono<Response> notifyPatient(@RequestBody Request request,@PathVariable("contact") String contact) {
		// do nothing here for demo...
		// irl would send email or text message or both
		return Mono.empty();
	}

}
