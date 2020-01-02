package com.aram.hovakyan.service.diagnose.impl;

import com.aram.hovakyan.common.diagnoses.DiagnoseCreationDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseUpdateDTO;
import com.aram.hovakyan.entity.DiagnoseEntity;
import com.aram.hovakyan.repository.DiagnoseRepository;
import com.aram.hovakyan.service.diagnose.DiagnosService;
import com.aram.hovakyan.service.diagnose.convert.DiagnosConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class DiagnosServiceImpl implements DiagnosService {


    private final DiagnosConverter diagnosConverter;
    private final DiagnoseRepository diagnoseRepository;

    @Override
    public DiagnoseDTO create(DiagnoseCreationDTO request) {
        DiagnoseEntity diagnoseEntity = diagnosConverter.convertDTOToEntity(request);
        diagnoseRepository.save(diagnoseEntity);
        return diagnosConverter.convertEntityToDTO(diagnoseEntity);
    }
    @Override
    public DiagnoseDTO getOne(Long id) {
        DiagnoseEntity diagnoseEntity = diagnoseRepository.getOne(id);
        return diagnosConverter.convertEntityToDTO(diagnoseEntity);
    }

    @Override
    public DiagnoseDTO update(DiagnoseUpdateDTO request) {
        DiagnoseEntity diagnoseEntity = diagnoseRepository.getOne(request.getId());
        diagnosConverter.update(request);
        diagnoseRepository.save(diagnoseEntity);
        return diagnosConverter.convertEntityToDTO(diagnoseEntity);

    }
}
