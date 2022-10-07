package com.codify.patient.onboarding.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
public class Patient {
    @NotEmpty
    private String id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String age;
    @NotEmpty
    private String zip;
    private String insurance;
    private String insuranceId;
    private String condition;
    private String phone;
    private String email;
    private ContactMethod contactMethod = ContactMethod.TEXT;

    public Patient(String id, String name, String age, String zip,
                   String insurance, String insuranceId, String condition, String email, String phone, String contactMethod) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.zip = zip;
        this.insurance = insurance;
        this.insuranceId = insuranceId;
        this.condition = condition;
        this.email = email;
        this.phone = phone;
        this.contactMethod = ContactMethod.valueOf(contactMethod);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", zip='" + zip + '\'' +
                ", insurance='" + insurance + '\'' +
                ", insuranceId='" + insuranceId + '\'' +
                ", condition='" + condition + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", contactMethod=" + contactMethod +
                '}';
    }
}
