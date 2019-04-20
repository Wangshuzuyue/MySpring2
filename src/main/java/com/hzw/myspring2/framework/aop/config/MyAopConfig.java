package com.hzw.myspring2.framework.aop.config;

import lombok.Data;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/17 16:41
 * @Description:
 */
@Data
public class MyAopConfig {

    private String pointCut;
    private String aspectBefore;
    private String aspectAfter;
    private String aspectClass;
    private String aspectAfterThrow;
    private String aspectAround;
    private String aspectAfterThrowingName;

}
