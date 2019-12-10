package com.aram.hovakyan.common.patient;

public class PatientCreationDTO {
    private String patientName;
    private String patientSurName;

    public String getPatientSurName() {
        return patientSurName;
    }

    public void setPatientSurName(String patientSurName) {
        this.patientSurName = patientSurName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
