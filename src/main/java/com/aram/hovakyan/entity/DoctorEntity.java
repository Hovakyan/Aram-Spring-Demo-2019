package com.aram.hovakyan.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "DoctorEntity")
@Getter
@Setter
public class DoctorEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 300)
    private String name;
    private String Surname;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
}
