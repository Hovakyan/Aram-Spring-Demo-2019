package com.aram.hovakyan.api;

import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.common.patient.PatientUpdateDTO;
import com.aram.hovakyan.service.patient.PatientService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.awt.print.Pageable;

@Getter
@Setter
@RestController
public class PatientControllerImpl implements PatienController {

    @Autowired
    PatientService patientService;

    @Override
    public PatientDTO get(Long patientID) {
        return null;
    }

    @Override
    public ResponseEntity<PageImpl<PatientDTO>> getAll(@NotNull @Positive Long Id, Integer page, Integer size) {
        return null;
    }

    @Override
    public PatientDTO create(final PatientCreationDTO request) {
        return patientService.create(request);
    }

    @Override
    public PatientDTO update(PatientUpdateDTO request) {
        return null;
    }
}
