package com.hzw.myspring2.framework.aop.aspect;

import com.hzw.myspring2.framework.aop.intercept.MyMethodInterceptor;
import com.hzw.myspring2.framework.aop.intercept.MyMethodInvocation;

import java.lang.reflect.Method;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/17 16:48
 * @Description:
 */
public class MyAfterThrowingAdviceInterceptor extends AbstractMyAspectAdvice implements MyMethodInterceptor {


    public MyAfterThrowingAdviceInterceptor(Method aspectMethod, Object aspectTarget) {
        super(aspectMethod, aspectTarget);
    }

    @Override
    public Object invoke(MyMethodInvocation mi) throws Throwable {
        try {
            return mi.proceed();
        }catch (Throwable e){
            invokeAdviceMethod(mi,null,e.getCause());
            throw e;
        }
    }
}
