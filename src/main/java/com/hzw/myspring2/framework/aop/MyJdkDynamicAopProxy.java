package com.hzw.myspring2.framework.aop;
import com.hzw.myspring2.framework.aop.intercept.MyMethodInvocation;
import com.hzw.myspring2.framework.aop.support.MyAdvisedSupport;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/17 16:55
 * @Description:
 */
public class MyJdkDynamicAopProxy implements MyAopProxy, InvocationHandler{

    private MyAdvisedSupport advisedSupport;

    public MyJdkDynamicAopProxy(MyAdvisedSupport advisedSupport){
        this.advisedSupport = advisedSupport;
    }

    @Override
    public Object getProxy() {
        return getProxy(this.advisedSupport.getTargetClass().getClassLoader());
    }

    @Override
    public Object getProxy(ClassLoader classLoader) {
        return Proxy.newProxyInstance(classLoader,this.advisedSupport.getTargetClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        List<Object> interceptorsAndDynamicMethodMatchers = this.advisedSupport
                .getInterceptorsAndDynamicInterceptionAdvice(method,this.advisedSupport.getTargetClass());

        MyMethodInvocation invocation = new MyMethodInvocation(
                proxy, this.advisedSupport.getTarget(),
                method, args, this.advisedSupport.getTargetClass(),
                interceptorsAndDynamicMethodMatchers);

        return invocation.proceed();
    }
}
