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
public class Response {

   private String correlationId;
   private String businessKey;
   private Id id;

   private Patient patient;
   private Doctor doctor;
   private Hospital hospital;
}
