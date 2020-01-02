package com.aram.hovakyan.service.patient.impl;

import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.entity.PatientEntity;
import com.aram.hovakyan.repository.PatientRepository;
import com.aram.hovakyan.service.patient.PatientService;
import com.aram.hovakyan.service.patient.convert.PatientConvert;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {


    private final PatientConvert patientConvert;
    private final PatientRepository patientRepository;


    @Override
    public PatientDTO create(PatientCreationDTO request) {
        PatientEntity patientEntity = patientConvert.convertDTOToEntity(request);
        patientRepository.save(patientEntity);
        return patientConvert.convertEntityToDTO(patientEntity);
    }

    @Override
    public PageImpl<PatientDTO> getAll(Pageable pageable) {
        return null;
    }
}
