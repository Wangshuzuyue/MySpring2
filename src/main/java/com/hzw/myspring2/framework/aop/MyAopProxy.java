package com.hzw.myspring2.framework.aop;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/17 16:41
 * @Description:
 */
public interface MyAopProxy {

    Object getProxy();


    Object getProxy(ClassLoader classLoader);
}
