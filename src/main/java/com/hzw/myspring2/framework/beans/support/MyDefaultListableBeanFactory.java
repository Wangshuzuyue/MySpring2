package com.hzw.myspring2.framework.beans.support;

import com.hzw.myspring2.framework.beans.config.MyBeanDefinition;
import com.hzw.myspring2.framework.context.support.MyAbstractApplicationContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author huangzuwang
 * @Date: 2019/4/9 20:17
 * @Description: IOC容器实现的顶层设计
 */
public class MyDefaultListableBeanFactory extends MyAbstractApplicationContext {

    /**
     * 存储注册信息的BeanDefinition,伪IOC容器
     */
    protected final Map<String, MyBeanDefinition> beanDefinitionMap
            = new ConcurrentHashMap<String, MyBeanDefinition>();
}
