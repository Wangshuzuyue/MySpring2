package com.hzw.myspring2.framework.annotation;

import java.lang.annotation.*;

/**
 * @author huangzuwang
 * @Date: 2019/4/14
 * @Description: 请求参数映射
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
	
	String value() default "";
	
	boolean required() default true;

}
