package com.aram.hovakyan.service.patient.convert;

import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.entity.PatientEntity;
import org.springframework.stereotype.Component;

@Component
public class PatientConvert {
    PatientEntity patientEntity;
    public PatientEntity convert(PatientCreationDTO request){

        patientEntity.setName(request.getPatientName());
        patientEntity.setSurName(request.getPatientSurName());

        return patientEntity;
    }


}
