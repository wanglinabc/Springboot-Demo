package com.example.demo.Util;

import lombok.Data;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class JSONResult implements Serializable {
    private int code;
    private String msg;
    private Map<String, Object> data;
    private static Map<String, Object> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public static void setResult(Map<String, Object> data) {
        JSONResult.result = data;
    }

    public JSONResult(int code, String msg, Map<String, Object> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Map outPutJson(int code , String msg) {
        Map result = new HashMap<>();
        result.put("code", code);
        result.put("message", msg);
        if  (JSONResult.result != null) {
            result.put("data", JSONResult.result);
        }
        return result;
    }
}
