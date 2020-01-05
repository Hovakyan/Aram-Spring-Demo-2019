package com.aram.hovakyan.entity;

import com.aram.hovakyan.common.enums.DiagnoseType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "DiagnoseEntity")
@Table(name = "diagnose_table")
@Getter
@Setter


public class DiagnoseEntity extends AbstractEntity {


    @Column(nullable = false,length = 300)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DiagnoseType diagnoseType;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "patient_id")
    private PatientEntity patientEntity;


}
