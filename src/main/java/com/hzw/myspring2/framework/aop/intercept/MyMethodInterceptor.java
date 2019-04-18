package com.hzw.myspring2.framework.aop.intercept;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/17 16:55
 * @Description:
 */
public interface MyMethodInterceptor {
    Object invoke(MyMethodInvocation invocation) throws Throwable;
}
