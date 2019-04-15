package com.hzw.myspring2.framework.core;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/9 20:14
 * @Description:
 */
public interface MyBeanFactory {

    Object getBean(String beanName) throws Exception;

    Object getBean(Class<?> beanClass) throws Exception;
}
