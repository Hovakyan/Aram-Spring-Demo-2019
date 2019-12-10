package com.aram.hovakyan.common.diagnoses;


import com.aram.hovakyan.common.enums.DiagnoseType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiagnoseDTO {
    private DiagnoseType type;

    public DiagnoseType getType() {
        return type;
    }

    public void setType(DiagnoseType type) {
        this.type = type;
    }
}
