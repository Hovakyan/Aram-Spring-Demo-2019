package com.aram.hovakyan.service.diagnose.convert;

import com.aram.hovakyan.common.diagnoses.DiagnoseCreationDTO;
import com.aram.hovakyan.common.diagnoses.DiagnoseDTO;
import com.aram.hovakyan.common.doctor.DoctorCreationDTO;
import com.aram.hovakyan.common.doctor.DoctorDTO;
import com.aram.hovakyan.common.enums.DiagnoseType;
import com.aram.hovakyan.entity.DiagnoseEntity;
import com.aram.hovakyan.entity.DoctorEntity;
import org.springframework.stereotype.Component;

@Component
public class DiagnosConverter {

    public DiagnoseEntity convert(DiagnoseCreationDTO request) {

        return null;
    }

    public DiagnoseDTO convert(DiagnoseEntity entity) {
        //TODO implemeny this
        return null;

    }
}
