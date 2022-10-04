package com.codify.patient.onboarding.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Request {

        private String correlationId;
        private String businessKey;
        private Id id;
}
