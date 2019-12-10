package com.aram.hovakyan.service.diagnose;

import com.aram.hovakyan.common.diagnoses.DiagnoseCreationDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseDTO;
import org.springframework.stereotype.Service;

@Service
public interface DiagnosService {

   DiagnoseDTO create(DiagnoseCreationDTO request);



}
