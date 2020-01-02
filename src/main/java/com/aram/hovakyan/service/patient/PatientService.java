package com.aram.hovakyan.service.patient;

import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {

    PatientDTO create(PatientCreationDTO request);
    PageImpl<PatientDTO> getAll(Pageable pageable);

}
