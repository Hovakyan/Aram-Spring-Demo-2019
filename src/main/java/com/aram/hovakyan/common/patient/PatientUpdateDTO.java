package com.aram.hovakyan.common.patient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientUpdateDTO {
    private Long id;
    private String name;
    private String surName;
}
