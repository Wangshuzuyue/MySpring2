package com.hzw.myspring2.framework.context.support;


/**
 * @author huangzuwang
 * @Date: 2019/4/9 20:17
 * @Description: IOC容器实现的顶层设计
 */
public abstract class MyAbstractApplicationContext {

    /**
     * 受保护，只提供给子类重写
     * @throws Exception
     */
    public void refresh() throws Exception {}
}
