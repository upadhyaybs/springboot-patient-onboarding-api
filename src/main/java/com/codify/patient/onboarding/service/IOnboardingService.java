package com.codify.patient.onboarding.service;

import com.codify.patient.onboarding.domain.Doctor;
import com.codify.patient.onboarding.domain.Hospital;

public interface IOnboardingService {

  Hospital getParticipatingHospital(String zip);

  Doctor getParticipatingDoctor(String condition);
  
}