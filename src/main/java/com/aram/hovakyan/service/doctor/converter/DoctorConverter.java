package com.aram.hovakyan.service.doctor.converter;

import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.entity.DoctorEntity;
import org.springframework.stereotype.Component;

@Component
public class DoctorConverter {
DoctorEntity doctorEntity;
    public DoctorEntity convert(DoctorCreationDTO request){
       doctorEntity.setSurname(request.getDoctorSurname());
       doctorEntity.setName(request.getDoctorName());
        return doctorEntity;
    }

    public DoctorDTO convert(DoctorEntity entity){
        //TODO implemeny this
        return null;
    }
}
