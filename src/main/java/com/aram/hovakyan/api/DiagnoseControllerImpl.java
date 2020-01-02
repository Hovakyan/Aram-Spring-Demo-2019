package com.aram.hovakyan.api;

import com.aram.hovakyan.common.diagnoses.DiagnoseCreationDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseUpdateDTO;
import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorUpdateDTO;
import com.aram.hovakyan.common.enums.DiagnoseType;
import com.aram.hovakyan.service.diagnose.DiagnosService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DiagnoseControllerImpl implements DiagnoseController {


    private final DiagnosService diagnosService;

    @Override
    public DiagnoseDTO get(Long diagnoseId) {
        return diagnosService.getOne(diagnoseId);
    }

    @Override
    public PageImpl<DiagnoseDTO> getAll(DiagnoseType type, Integer page, Integer size) {
        return null;
    }

    @Override
    public DiagnoseDTO create(DiagnoseCreationDTO request) {
        return diagnosService.create(request);
    }

    @Override
    public DiagnoseDTO update(DiagnoseUpdateDTO request) {
        return diagnosService.update(request);
    }
}
