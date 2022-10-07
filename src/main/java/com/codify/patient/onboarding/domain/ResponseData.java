package com.codify.patient.onboarding.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData {
    private Patient patient;
    private Doctor doctor;
    private Hospital hospital;

}
