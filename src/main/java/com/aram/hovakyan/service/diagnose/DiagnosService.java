package com.aram.hovakyan.service.diagnose;

import com.aram.hovakyan.common.diagnoses.DiagnoseCreationDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseUpdateDTO;
import org.springframework.stereotype.Service;

@Service
public interface DiagnosService {

   DiagnoseDTO create(DiagnoseCreationDTO request);
   DiagnoseDTO getOne(Long id);
   DiagnoseDTO update(DiagnoseUpdateDTO request);



}
