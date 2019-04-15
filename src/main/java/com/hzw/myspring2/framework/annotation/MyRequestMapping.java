package com.hzw.myspring2.framework.annotation;

import java.lang.annotation.*;

/**
 * @author huangzuwang
 * @Date: 2019/4/14
 * @Description:
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {
	String value() default "";
}
