package com.aram.hovakyan.common.diagnoses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiagnoseCreationDTO {
    private String diagnosName;

    public String getDiagnosName() {
        return diagnosName;
    }

    public void setDiagnosName(String diagnosName) {
        this.diagnosName = diagnosName;
    }
}
