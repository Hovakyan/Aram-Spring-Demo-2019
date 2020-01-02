package com.aram.hovakyan.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "DoctorEntity")
@Table(name = "doctor_table")
@Getter
@Setter
public class DoctorEntity extends AbstractEntity{

    @Column(nullable = false,length = 300)
    private String name;
    @Column(nullable = false,length = 300)
    private String Surname;

@OneToMany(mappedBy = "doctorEntity",cascade = CascadeType.ALL,orphanRemoval = true)
public List<PatientEntity> patientEntities;

}
