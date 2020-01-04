package com.aram.hovakyan.api;

import com.aram.hovakyan.common.patient.PatientCreationDTO;
import com.aram.hovakyan.common.patient.PatientDTO;
import com.aram.hovakyan.common.patient.PatientUpdateDTO;
import com.aram.hovakyan.entity.PatientEntity;
import com.aram.hovakyan.repository.PatientRepository;
import com.aram.hovakyan.service.patient.PatientService;
import com.aram.hovakyan.service.patient.convert.PatientConvert;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RestController
@RequiredArgsConstructor
public class PatientControllerImpl implements PatienController {


    private final PatientService patientService;
    private final PatientRepository patientRepository;
    private final PatientConvert patientConvert;
    @Override
    public PatientDTO get(Long patientID) {
        return null;
    }

    @Override
    public ResponseEntity<PageImpl<PatientDTO>> getAll(
    @NotNull @Positive Long Id, Integer page, Integer size) {

        PageImpl<PatientDTO> list = patientService.getAll(Id,getPageable(page,size));

        return new ResponseEntity<>(list,new HttpHeaders(),HttpStatus.OK);
    }

    @Override
    public PatientDTO create(final PatientCreationDTO request) {
        return patientService.create(request);
    }

    @Override
    public PatientDTO update(PatientUpdateDTO request) {
        return null;
    }

    @Override
    public List<PatientDTO> getdocid(Long id) {
        List<PatientDTO> list = new ArrayList<>();
        for (PatientEntity r:patientRepository.findAll()
             ) {
            if (r.getDoctorEntity().getId().equals(id)){
                list.add(patientConvert.convertEntityToDTO(r));
            }
        }
        return list;
    }
}
