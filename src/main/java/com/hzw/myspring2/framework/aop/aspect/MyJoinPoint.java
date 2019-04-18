package com.hzw.myspring2.framework.aop.aspect;

import java.lang.reflect.Method;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/17 16:49
 * @Description:
 */
public interface MyJoinPoint {

    Object getThis();

    Object[] getArguments();

    Method getMethod();

    void setUserAttribute(String key, Object value);

    Object getUserAttribute(String key);
}
