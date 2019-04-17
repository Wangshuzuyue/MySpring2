package com.hzw.myspring2.framework.webmvc;

import java.util.Map;

/**
 * @author huangzuwang
 * @Date: 2019/4/14
 * @Description:
 */
public class MyModelAndView {
    private String viewName;
    private Map<String,?> model;

    public MyModelAndView(String viewName) { this.viewName = viewName; }

    public MyModelAndView(String viewName, Map<String, ?> model) {
        this.viewName = viewName;
        this.model = model;
    }

    public String getViewName() {
        return viewName;
    }


    public Map<String, ?> getModel() {
        return model;
    }

}
