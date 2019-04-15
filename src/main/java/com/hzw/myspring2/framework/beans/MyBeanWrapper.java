package com.hzw.myspring2.framework.beans;

/**
 * @author huangzuwang
 * @Date: 2019/4/14 20:22
 * @Description:
 */
public class MyBeanWrapper {
    private Object wrappedInstance;
    private Class<?> wrappedClass;

    public MyBeanWrapper(Object wrappedInstance){
        this.wrappedInstance = wrappedInstance;
    }

    public Object getWrappedInstance(){
        return this.wrappedInstance;
    }

    // 返回代理以后的Class
    // 可能会是这个 $Proxy0
    public Class<?> getWrappedClass(){
        return this.wrappedInstance.getClass();
    }
}
