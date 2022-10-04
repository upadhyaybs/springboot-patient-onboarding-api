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

	@PostMapping("/assignhospital")
	public Mono<Response> assignHospitalToPatient(@RequestBody Request request) {
		log.info("assignHospitalToPatient |Request : " +request );
		return Mono.just(Response.builder().correlationId(request.getCorrelationId()).hospital(service.getParticipatingHospital(request.getRequestData().getZip())).build());
	}

	@PostMapping("/assigndoctor")
	public Mono<Response> assignDoctorToPatient(@RequestBody Request request) {
		log.info("assignDoctorToPatient |Request : " +request );
		return Mono.just(Response.builder().correlationId(request.getCorrelationId()).doctor(service.getParticipatingDoctor(request.getRequestData().getCondition())).build());
	}

	@PostMapping("/notify")
	public Mono<Response> notifyPatient(@RequestBody Request request) {
		log.info("notifyPatient |Request : " +request );
		// do nothing here for demo...
		// irl would send email or text message or both
		return Mono.empty();
	}

}
