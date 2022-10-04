package com.codify.patient.onboarding.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RequestData {

    private String zip;
    private String condition;
    private String contact;
}
