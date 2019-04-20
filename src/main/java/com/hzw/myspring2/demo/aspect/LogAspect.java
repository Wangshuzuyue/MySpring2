package com.hzw.myspring2.demo.aspect;

import com.hzw.myspring2.framework.aop.aspect.MyJoinPoint;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Auther: huangzuwang
 * @Date: 2019/4/14 14:50
 * @Description:
 */
@Slf4j
public class LogAspect {

    //在调用一个方法之前，执行before方法
    public void before(MyJoinPoint joinPoint){
        joinPoint.setUserAttribute("startTime_" + joinPoint.getMethod().getName(),System.currentTimeMillis());
        //这个方法中的逻辑，是由我们自己写的
        log.info(">>>>>>>>Invoker Before Method!!!" +
                "\nTargetObject:" +  joinPoint.getThis() +
                "\nArgs:" + Arrays.toString(joinPoint.getArguments()));
    }

    //在调用一个方法之后，执行after方法
    public void after(MyJoinPoint joinPoint){
        log.info(">>>>>>>>Invoker After Method!!!" +
                "\nTargetObject:" +  joinPoint.getThis() +
                "\nArgs:" + Arrays.toString(joinPoint.getArguments()));
        long startTime = (Long) joinPoint.getUserAttribute("startTime_" + joinPoint.getMethod().getName());
        long endTime = System.currentTimeMillis();
        System.out.println("use time :" + (endTime - startTime));
    }

    public void afterThrowing(MyJoinPoint joinPoint, Throwable ex){
        log.info(">>>>>>>>出现异常" +
                "\nTargetObject:" +  joinPoint.getThis() +
                "\nArgs:" + Arrays.toString(joinPoint.getArguments()) +
                "\nThrows:" + ex.getMessage());
    }

    public void around(MyJoinPoint joinPoint, Throwable ex){
        log.info(">>>>><<<<<<Around" +
                "\nTargetObject:" +  joinPoint.getThis() +
                "\nArgs:" + Arrays.toString(joinPoint.getArguments()));
    }
}
