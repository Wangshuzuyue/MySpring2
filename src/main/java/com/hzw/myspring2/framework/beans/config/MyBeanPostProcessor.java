package com.hzw.myspring2.framework.beans.config;

/**
 * @author huangzuwang
 * @Date: 2019/4/9
 * @Description:
 */
public class MyBeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        return bean;
    }
}
