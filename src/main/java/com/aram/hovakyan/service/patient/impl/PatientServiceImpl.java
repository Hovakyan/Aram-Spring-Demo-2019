package com.aram.hovakyan.service.patient.impl;

import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.entity.PatientEntity;
import com.aram.hovakyan.repository.PatientRepository;
import com.aram.hovakyan.service.patient.PatientService;
import com.aram.hovakyan.service.patient.convert.PatientConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientConvert patientConvert;
    @Autowired
    PatientRepository patientRepository;


    @Override
    public PatientDTO create(PatientCreationDTO request) {
        PatientEntity patientEntity = patientConvert.convert(request);
        patientRepository.save(patientEntity);

        return null;
    }
}
