package com.codify.patient.onboarding.repository;


import java.util.List;

import com.codify.patient.onboarding.domain.Doctor;
import com.codify.patient.onboarding.domain.Hospital;
import com.codify.patient.onboarding.domain.Patient;


public interface IOnboardingPatientRepository {

    Patient savePatient(Patient patient);

    List<Hospital> getParticipatingHospitals();

    List<Doctor> getParticipatingDoctors();
}
