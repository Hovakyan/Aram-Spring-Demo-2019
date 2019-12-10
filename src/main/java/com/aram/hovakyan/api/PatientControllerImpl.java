package com.aram.hovakyan.api;

import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.common.patient.PatientUpdateDTO;
import com.aram.hovakyan.service.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientControllerImpl implements PatienController {

    @Autowired
    PatientService patientService;

    @Override
    public PatientDTO get(Long patientID) {
        return null;
    }

    @Override
    public PageImpl<PatientDTO> getAll(Integer page, Integer size) {
        return null;
    }

    @Override
    public PatientDTO create(PatientCreationDTO request) {
        return patientService.create(request);
    }

    @Override
    public PatientDTO update(PatientUpdateDTO request) {
        return null;
    }
}
