package com.hzw.myspring2.framework.aop.aspect;
import com.hzw.myspring2.framework.aop.intercept.MyMethodInterceptor;
import com.hzw.myspring2.framework.aop.intercept.MyMethodInvocation;

import java.lang.reflect.Method;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/17 16:44
 * @Description:
 */
public class MyMethodBeforeAdviceInterceptor extends AbstractMyAspectAdvice implements MyMethodInterceptor {


    private MyJoinPoint joinPoint;
    public MyMethodBeforeAdviceInterceptor(Method aspectMethod, Object aspectTarget) {
        super(aspectMethod, aspectTarget);
    }

    private void before(Method method,Object[] args,Object target) throws Throwable{
        //传送了给织入参数
        //method.invoke(target);
        super.invokeAdviceMethod(this.joinPoint,null,null);

    }
    @Override
    public Object invoke(MyMethodInvocation mi) throws Throwable {
        //从被织入的代码中才能拿到，JoinPoint
        this.joinPoint = mi;
        before(mi.getMethod(), mi.getArguments(), mi.getThis());
        return mi.proceed();
    }
}
