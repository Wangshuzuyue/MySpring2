package com.hzw.myspring2.framework.webmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huangzuwang
 * @Date: 2019/4/14
 * @Description:
 */
public class MyHandlerAdapter {
    public boolean supports(Object handler){ return (handler instanceof MyHandlerMapping);}


    MyModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        return null;
    }
}
