package com.aram.hovakyan.common.enums;



import lombok.Getter;

@Getter
public enum DiagnoseType {
    FATAL,
    CURABLE;

//    DiagnoseType(String text) {
//        this.text = text;
//    }
//
//    private String text;


//    public static DiagnoseType fromText(String text){
//        for(DiagnoseType r : DiagnoseType.values()){
//            if(r.getText().equals(text)){
//                return r;
//            }
//        }
//        throw new IllegalArgumentException();
//    }

}
