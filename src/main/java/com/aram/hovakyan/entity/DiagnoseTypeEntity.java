package com.aram.hovakyan.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class DiagnoseTypeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 300)
    private String name;


}
