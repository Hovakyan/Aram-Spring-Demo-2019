package com.aram.hovakyan.service.diagnose.impl;

import com.aram.hovakyan.common.diagnoses.DiagnoseCreationDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseDTO;
import com.aram.hovakyan.entity.DiagnoseEntity;
import com.aram.hovakyan.repository.DiagnoseRepository;
import com.aram.hovakyan.service.diagnose.DiagnosService;
import com.aram.hovakyan.service.diagnose.convert.DiagnosConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiagnosServiceImpl implements DiagnosService {

    @Autowired
    DiagnosConverter diagnosConverter;
    @Autowired
    DiagnoseRepository diagnoseRepository;



    @Override
    public DiagnoseDTO create(DiagnoseCreationDTO request) {
        DiagnoseEntity diagnoseEntity = diagnosConverter.convert(request);
        diagnoseRepository.save(diagnoseEntity);


        return null;
    }
}
