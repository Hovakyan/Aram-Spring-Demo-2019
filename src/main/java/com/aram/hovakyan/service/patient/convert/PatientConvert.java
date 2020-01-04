package com.aram.hovakyan.service.patient.convert;

import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.entity.DoctorEntity;
import com.aram.hovakyan.entity.PatientEntity;
import com.aram.hovakyan.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PatientConvert {

    private final DoctorRepository doctorRepository;


    public PatientEntity convertDTOToEntity(PatientCreationDTO request){
        DoctorEntity doctorEntity = doctorRepository.getOne(request.getId());

        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setName(request.getName());
        patientEntity.setSurName(request.getSurName());
        doctorEntity.getPatientEntities().add(patientEntity);
        patientEntity.setDoctorEntity(doctorEntity);
        return patientEntity;
    }

    public PatientDTO convertEntityToDTO(PatientEntity entity){
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(entity.getId());
        patientDTO.setName(entity.getName());
        patientDTO.setSurName(entity.getSurName());
        return patientDTO;
    }


    public List<PatientDTO> convert(Page<PatientEntity> request) {
        return request.stream().map(this::convertEntityToDTO).collect(Collectors.toList());
    }


}
