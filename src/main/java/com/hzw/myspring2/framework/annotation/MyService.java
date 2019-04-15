package com.hzw.myspring2.framework.annotation;

import java.lang.annotation.*;

/**
 * @author huangzuwang
 * @Date: 2019/4/14
 * @Description: 业务逻辑,注入接口
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyService {
	String value() default "";
}
