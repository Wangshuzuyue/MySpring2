package com.hzw.myspring2.demo.controller;

import com.hzw.myspring2.framework.annotation.MyController;
import com.hzw.myspring2.framework.annotation.MyRequestMapping;
import com.hzw.myspring2.framework.annotation.MyRequestParam;
import com.hzw.myspring2.framework.webmvc.MyModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/14 14:21
 * @Description:
 */
@MyController
@MyRequestMapping("/test")
public class TestController {

    @MyRequestMapping("/hello")
    public MyModelAndView hello(@MyRequestParam("name") String name, @MyRequestParam("age") Integer age){
        String str = "name: " + name + "age: " + age;
        System.out.println(str);
        Map<String, Object> models = new HashMap<>();
        models.put("name", name);
        models.put("age", age);
        MyModelAndView first = new MyModelAndView("first", models);
        return first;
    }

}
