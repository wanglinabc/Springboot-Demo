package com.example.demo.Util;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class AuthToken {
    public String getToken(){
        String token = System.currentTimeMillis() + new Random().nextInt() + "";
        return MD5.getMD5( token );
    }
}
