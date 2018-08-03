package com.example.demo.Exception;

import com.example.demo.Util.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@Slf4j
public class GlobalDefultExceptionHandler {

    @ExceptionHandler(AuthException.class)
    public ResponseResult defultExcepitonHandler(HttpServletRequest request, AuthException exception) {
        return ResponseResult.createByErrorMessage(exception.getMessage());
    }


    //默认处理类，你可以自定义自己的异常
    @ExceptionHandler(Exception.class)
    public ResponseResult defultExcepitonHandler(HttpServletRequest request, Exception exception) {
        return ResponseResult.createByErrorMessage(exception.getMessage());
    }

    //Admin异常处处理类
    @ExceptionHandler(AdminException.class)
    public ResponseResult defultExcepitonHandler(HttpServletRequest request, AdminException exception) {
        return ResponseResult.createByErrorCodeMessage(exception.getErrorCode(), exception.getMessage());
    }


}
