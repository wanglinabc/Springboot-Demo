package com.example.demo.Exception;


import com.example.demo.Util.JSONResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class GlobalDefultExceptionHandler {


    @ExceptionHandler(AuthException.class)
    public Map defultExcepitonHandler(HttpServletRequest request, AuthException exception) {

        Integer code = 200;
        if (exception.getCode() != null) {
            code = exception.getCode();
        }

        Map<String,Object> result = new HashMap<>();
        result.put("message", exception.getMessage());
        result.put("code", code);
        result.put("error type", "MyException");
        return result;
    }

    //默认处理类，你可以自定义自己的异常
    @ExceptionHandler(Exception.class)
    public JSONResult defultExcepitonHandler(HttpServletRequest request, Exception exception) {
        JSONResult result= new JSONResult(200,exception.getMessage(),null);
        return result;
    }


}
