package com.aram.hovakyan.service.doctor.converter;

import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.entity.DoctorEntity;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DoctorConverter {

    public DoctorEntity convertDTOTOEntity(DoctorCreationDTO request){
     DoctorEntity doctorEntity = new DoctorEntity();
       doctorEntity.setSurname(request.getSurname());
       doctorEntity.setName(request.getName());
        return doctorEntity;
    }

    public DoctorDTO convertEntityToDTO(DoctorEntity entity){
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setId(entity.getId());
        doctorDTO.setName(entity.getName());
        doctorDTO.setSurname(entity.getSurname());
        return doctorDTO;
    }

    public List<DoctorDTO> convert(Page<DoctorEntity> request) {
        return request.stream().map(this::convertEntityToDTO).collect(Collectors.toList());
    }

}
