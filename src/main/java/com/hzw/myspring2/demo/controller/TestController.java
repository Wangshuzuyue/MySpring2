package com.hzw.myspring2.demo.controller;

import com.hzw.myspring2.framework.annotation.MyController;
import com.hzw.myspring2.framework.annotation.MyRequestMapping;
import com.hzw.myspring2.framework.annotation.MyRequestParam;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/14 14:21
 * @Description:
 */
@MyController
@MyRequestMapping("/test")
public class TestController {

    @MyRequestMapping("/hello")
    public Object hello(@MyRequestParam("name") String name, @MyRequestParam("age") Integer age){
        String str = "name: " + name + "age: " + age;
        System.out.println(str);

        return str;
    }

}
