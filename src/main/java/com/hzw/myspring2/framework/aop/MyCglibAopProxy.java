package com.hzw.myspring2.framework.aop;


import com.hzw.myspring2.framework.aop.support.MyAdvisedSupport;
import org.mockito.cglib.proxy.Enhancer;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/17 16:55
 * @Description:
 */
public class MyCglibAopProxy implements  MyAopProxy {
    public MyCglibAopProxy(MyAdvisedSupport config) {
    }

    @Override
    public Object getProxy() {
        //TODO
        return null;
    }

    @Override
    public Object getProxy(ClassLoader classLoader) {
        //TODO
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyCglibAopProxy.class);
//        enhancer.setCallback();
        return null;
    }
}
