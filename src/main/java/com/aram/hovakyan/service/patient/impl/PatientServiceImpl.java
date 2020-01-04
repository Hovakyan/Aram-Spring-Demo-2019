package com.aram.hovakyan.service.patient.impl;

import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.entity.PatientEntity;
import com.aram.hovakyan.repository.PatientRepository;
import com.aram.hovakyan.service.patient.PatientService;
import com.aram.hovakyan.service.patient.convert.PatientConvert;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public PageImpl<PatientDTO> getAll(Long id, Pageable pageable) {

        Pageable paging = PageRequest.of(pageable.getPageNumber(),pageable.getPageSize()
                , Sort.by(String.valueOf(id)));

        Page<PatientEntity> pagedResult = patientRepository.findAll(paging);

        if(pagedResult.hasContent()) {
            return new PageImpl<>(patientConvert.convert(pagedResult)) ;
        } else {
            return null;
        }
    }




}

