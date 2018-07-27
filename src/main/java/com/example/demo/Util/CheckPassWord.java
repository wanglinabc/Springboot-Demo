package com.example.demo.Util;

import org.springframework.stereotype.Component;

@Component
public class CheckPassWord {

    public static boolean checkPassWordMethod(String str) {
        char[] ch1 = str.toCharArray();
        boolean flag = false;
        int num_count = 0, char_number = 0;
        for (int i = 0; i < ch1.length; i++) {
            if (Character.isDigit(ch1[i]) || Character.isLetter(ch1[i])) {
                if (Character.isDigit(ch1[i]))
                    num_count++;
                else
                    char_number++;
            } else
                break;
        }
        if (num_count >= 1 && char_number >= 8)
            flag = true;
        return flag;
    }
}
