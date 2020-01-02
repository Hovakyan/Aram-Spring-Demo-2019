package com.aram.hovakyan.common.diagnoses;


import com.aram.hovakyan.common.enums.DiagnoseType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiagnoseDTO {
    private Long id;
    private String name;
    private DiagnoseType type;


}
