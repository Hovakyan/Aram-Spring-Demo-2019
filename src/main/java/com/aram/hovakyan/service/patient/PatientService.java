package com.aram.hovakyan.service.patient;

import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {

    PatientDTO create(PatientCreationDTO request);

}
