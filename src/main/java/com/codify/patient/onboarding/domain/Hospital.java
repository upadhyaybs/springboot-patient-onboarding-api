package com.codify.patient.onboarding.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {
    private String name;
    private String address;
    private String phone;
    private String zip;
}
