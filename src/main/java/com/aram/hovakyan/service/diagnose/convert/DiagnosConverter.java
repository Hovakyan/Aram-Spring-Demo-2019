package com.aram.hovakyan.service.diagnose.convert;

import com.aram.hovakyan.common.diagnoses.DiagnoseCreationDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseUpdateDTO;
import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.common.enums.DiagnoseType;
import com.aram.hovakyan.entity.DiagnoseEntity;
import com.aram.hovakyan.entity.DoctorEntity;
import com.aram.hovakyan.entity.PatientEntity;
import com.aram.hovakyan.repository.DiagnoseRepository;
import com.aram.hovakyan.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DiagnosConverter {

    private final DiagnoseRepository diagnoseRepository;
    private final PatientRepository patientRepository;

    public DiagnoseEntity convertDTOToEntity(DiagnoseCreationDTO request) {
        PatientEntity patientEntity = patientRepository.getOne(request.getId());

        DiagnoseEntity diagnoseEntity = new DiagnoseEntity();
        diagnoseEntity.setName(request.getName());
        diagnoseEntity.setDiagnoseType(request.getType());

        diagnoseEntity.setPatientEntity(patientEntity);
        return diagnoseEntity;
    }

    public DiagnoseDTO convertEntityToDTO(DiagnoseEntity request) {
        DiagnoseDTO diagnoseDTO = new DiagnoseDTO();
        diagnoseDTO.setId(request.getId());
        diagnoseDTO.setName(request.getName());
        diagnoseDTO.setType(request.getDiagnoseType());
        return diagnoseDTO;
    }

    public  void update (DiagnoseUpdateDTO request){
        DiagnoseEntity diagnoseEntity = diagnoseRepository.getOne(request.getId());
        diagnoseEntity.setDiagnoseType(request.getType());
        diagnoseEntity.setId(request.getId());
        diagnoseEntity.setName(request.getName());
    }
}
