package com.hzw.myspring2;

import java.math.BigDecimal;

/**
 * @author: huangzuwang
 * @date: 2020-08-15 11:23
 * @description:
 */
public class Demo {

    public static void main(String[] args) {

    }

    public static Integer toNum(String str){
        if (str == null){
            return null;
        }
        //内容合法判断
        for (Character c : str.toCharArray()){
            if (c < '0' || c > '9'){
                throw new RuntimeException();
            }
        }
        Integer maxValue = Integer.MAX_VALUE;

        int result = 0;
        try {
            for (int index = str.length(); index > 0; index--){
                char c = str.charAt(index - 1);
                result += c;

                if (result < 0){
                    throw new RuntimeException();
                }
            }
        }catch (Exception e){
            throw new RuntimeException();
        }
        return result;
    }
}
