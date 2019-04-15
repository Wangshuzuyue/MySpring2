package com.hzw.myspring2.framework.annotation;

import java.lang.annotation.*;


/**
 * @author huangzuwang
 * @Date: 2019/4/14
 * @Description: 自动注入
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowired {
	String value() default "";
}
