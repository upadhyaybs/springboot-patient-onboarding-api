package com.codify.patient.onboarding.service;



import com.codify.patient.onboarding.domain.Doctor;
import com.codify.patient.onboarding.domain.Hospital;
import com.codify.patient.onboarding.repository.IOnboardingPatientRepository;


import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class OnboardingServiceImpl implements IOnboardingService{


    private final IOnboardingPatientRepository repository;

    public OnboardingServiceImpl(IOnboardingPatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Hospital getParticipatingHospital(String zip) {
        List<Hospital> hospitalFlux= repository.getParticipatingHospitals();
        Stream<Hospital> hospitals = hospitalFlux.stream();
        return hospitals.filter(h -> h.getZip().equals(zip))
                .findFirst()
                .orElse(new Hospital("Local Hospital","123 Local Street", "555-55-5555", "12345"));
    }

    @Override
    public Doctor getParticipatingDoctor(String condition) {
        List<Doctor> doctorFlux= repository.getParticipatingDoctors();
        Stream<Doctor> doctors = doctorFlux.stream();
        return doctors.filter(d -> d.getSpecialty().equals(condition))
                .findFirst()
                .orElse(new Doctor("Michael Scott", "img/docfemale.png", "General"));

    }
}
        