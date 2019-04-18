package com.hzw.myspring2.demo.service.impl;

import com.hzw.myspring2.demo.service.TestService;
import com.hzw.myspring2.framework.annotation.MyService;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/18 12:38
 * @Description:
 */

@MyService("testService")
public class TestServiceImpl implements TestService{
    @Override
    public String hello(String name, Integer age) {
        String str = "service:  name:" + name + "  age:" + age;
        System.out.println(str);
        return str;
    }
}
