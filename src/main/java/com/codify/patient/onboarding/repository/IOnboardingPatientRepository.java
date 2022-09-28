package com.codify.patient.onboarding.repository;


import java.util.List;

import com.codify.patient.onboarding.domain.Doctor;
import com.codify.patient.onboarding.domain.Hospital;


public interface IOnboardingPatientRepository {

    List<Hospital> getParticipatingHospitals();

    List<Doctor> getParticipatingDoctors();
}
