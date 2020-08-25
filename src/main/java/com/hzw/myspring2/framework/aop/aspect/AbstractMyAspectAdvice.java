package com.hzw.myspring2.framework.aop.aspect;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: huangzuwang
 * @date: 2020-04-12 17:32
 **/
@Data
public abstract class AbstractMyAspectAdvice {

    /**
     * 切面里定义的方法
     */
    private Method aspectMethod;

    /**
     * 切面对象
     */
    private Object aspectTarget;

    private String throwingName;

    public AbstractMyAspectAdvice(Method aspectMethod, Object aspectTarget) {
       this.aspectMethod = aspectMethod;
       this.aspectTarget = aspectTarget;
    }

    public Object invokeAdviceMethod(MyJoinPoint joinPoint, Object returnValue, Throwable tx) throws Throwable{
        Class<?> [] paramTypes = this.aspectMethod.getParameterTypes();
        if(null == paramTypes || paramTypes.length == 0){
            return this.aspectMethod.invoke(aspectTarget);
        }else{
            Object [] args = new Object[paramTypes.length];
            for (int i = 0; i < paramTypes.length; i ++) {
                if(paramTypes[i] == MyJoinPoint.class){
                    args[i] = joinPoint;
                }else if(paramTypes[i] == Throwable.class){
                    args[i] = tx;
                }else if(paramTypes[i] == Object.class){
                    args[i] = returnValue;
                }
            }
            return this.aspectMethod.invoke(aspectTarget,args);
        }
    }
}
