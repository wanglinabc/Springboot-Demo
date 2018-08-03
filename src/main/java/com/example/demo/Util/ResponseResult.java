package com.example.demo.Util;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by geely
 */

//保证序列化json的时候,如果是null的对象,key也会消失

@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class ResponseResult<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    private ResponseResult(int status){
        this.status = status;
    }
    private ResponseResult(int status, T data){
        this.status = status;
        this.data = data;
    }

    private ResponseResult(int status, String msg, T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private ResponseResult(int status, String msg){
        this.status = status;
        this.msg = msg;
    }

    //使之不在json序列化结果当中
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public  boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }



    public int getStatus(){
        return status;
    }
    public T getData(){
        return data;
    }
    public String getMsg(){
        return msg;
    }

    //只返回成功的status字段
    public static <T> ResponseResult<T> createBySuccess(){
        return new ResponseResult<T>(ResponseCode.SUCCESS.getCode());
    }

    //返回成功的status和msg
    public static <T> ResponseResult<T> createBySuccessMessage(String msg){
        return new ResponseResult<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    //返回成功的状态status和数据
    public static <T> ResponseResult<T> createBySuccessData(T data){
        return new ResponseResult<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    //返回成功的状态status msg 和data
    public static <T> ResponseResult<T> createBySuccessMsgData (String msg, T data){
        return new ResponseResult<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }

    //返回错误的状态码和错误描述
    public static <T> ResponseResult<T> createByError(){
        return new ResponseResult<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }

    //返回错误的状态码和错误信息
    public static <T> ResponseResult<T> createByErrorMessage(String errorMessage){
        return new ResponseResult<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    //返回自定义错误的状态码和错误信息
    public static <T> ResponseResult<T> createByErrorCodeMessage(int errorCode, String errorMessage){
        return new ResponseResult<T>(errorCode,errorMessage);
    }













}
