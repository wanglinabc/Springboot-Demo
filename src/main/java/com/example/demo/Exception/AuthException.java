package com.example.demo.Exception;

public class AuthException extends RuntimeException{

    private static Integer code;

    public AuthException(String message){
        super(message);
    }

    public Integer getCode() {
        return code;
    }

    public static void setCode(Integer code) {
        AuthException.code = code;
    }

}
