package com.codify.patient.onboarding.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private String name;
    private String img;
    private String specialty;
}
