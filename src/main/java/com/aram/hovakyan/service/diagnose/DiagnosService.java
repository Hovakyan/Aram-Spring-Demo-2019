package com.aram.hovakyan.service.diagnose;

import com.aram.hovakyan.common.diagnoses.DiagnoseCreationDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseDTO;

public interface DiagnosService {

   DiagnoseDTO create(DiagnoseCreationDTO request);



}
