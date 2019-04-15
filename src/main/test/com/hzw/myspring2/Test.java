package com.hzw.myspring2;

import com.hzw.myspring2.demo.controller.TestController;
import com.hzw.myspring2.framework.context.MyApplicationContext;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/14 14:15
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MyApplicationContext context = new MyApplicationContext("classpath:application.properties");
        try {
            Object object = context.getBean(TestController.class);
            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
