package com.example.demo.Exception;

public class AdminException extends RuntimeException{

    private int errorCode = 500;

    public AdminException(int errorCode, String message){
        super(message);
        this.setErrorCode(errorCode);
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}


