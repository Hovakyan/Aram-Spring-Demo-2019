package com.aram.hovakyan.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class DoctorEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 300)
    private String name;
    private String Surname;



}
