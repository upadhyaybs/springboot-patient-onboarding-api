package com.codify.patient.onboarding.service;

import com.codify.patient.onboarding.domain.Doctor;
import com.codify.patient.onboarding.domain.Hospital;
import com.codify.patient.onboarding.domain.Patient;

public interface IOnboardingService {

  Patient save(Patient patient);

  Hospital getParticipatingHospital(String zip);

  Doctor getParticipatingDoctor(String condition);
  
}