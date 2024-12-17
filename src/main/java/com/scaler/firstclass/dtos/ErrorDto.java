package com.scaler.firstclass.dtos;


import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class ErrorDto {
    private String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

//
//package com.scaler.novprojectmodule.dto;
//
//import lombok.Getter;
//import lombok.Setter;
//
//public class ErrorDto {
//    private String message;
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//}