package com.codify.patient.onboarding.resource;

import com.codify.patient.onboarding.domain.Patient;
import com.codify.patient.onboarding.domain.Response;
import com.codify.patient.onboarding.domain.ResponseData;
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

	@PostMapping("/patient")
	public Mono<Response> addPatient(@RequestBody Patient request) {
		log.info("assignHospitalToPatient |Request : " +request );
		return Mono.just(Response.builder()
				.data(ResponseData.builder().patient(service.save(request)).build())
				.build());
	}

	@GetMapping("/assignhospital/{zip}")
	public Mono<Response> assignHospitalToPatient(@PathVariable("zip") String zip) {
		log.info("assignHospitalToPatient |zip : " +zip );
		return Mono.just(Response.builder()
				.data(ResponseData.builder().hospital(service.getParticipatingHospital(zip)).build())
				.build());
	}

	@GetMapping("/assigndoctor/{condition}")
	public Mono<Response> assignDoctorToPatient(@PathVariable("condition") String condition) {
		log.info("assignDoctorToPatient |condition : " +condition );
		return Mono.just(Response.builder()
				.data(ResponseData.builder().doctor(service.getParticipatingDoctor(condition)).build())
				.build());
	}

	@PostMapping("/notify/{contact}")
	public Mono<Response> notifyPatient(@PathVariable("contact") String contact) {
		log.info("notifyPatient |contact : " +contact );
		// do nothing here for demo...
		// irl would send email or text message or both
		return Mono.empty();
	}

}
