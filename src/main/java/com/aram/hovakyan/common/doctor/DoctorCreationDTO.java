package com.aram.hovakyan.common.doctor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorCreationDTO {

    private String doctorName;
    private String doctorSurname;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }
}


