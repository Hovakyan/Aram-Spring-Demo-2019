package com.aram.hovakyan.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "PatientEntity" )
@Table(name = "patient_table")
@Getter
@Setter

public class PatientEntity extends AbstractEntity{

    @Column(nullable = false,length = 300)
    private String name;
    @Column(nullable = false,length = 300)
    private String surName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
   public DoctorEntity doctorEntity;
}
