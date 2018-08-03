package com.example.demo.Util;

import java.util.Random;

/**
 * 生成随机字符串工具类
 */
public class RandStr {

   public static String getRandStr(int length){

       String str="zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
       Random random=new Random();
       StringBuffer sb=new StringBuffer();
       int lengths=str.length()-1;
       for(int i=0; i<length; ++i){
           int number=random.nextInt(lengths);
           sb.append(str.charAt(number));
       }
       return sb.toString();
   }



}
