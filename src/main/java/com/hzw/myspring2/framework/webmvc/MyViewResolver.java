package com.hzw.myspring2.framework.webmvc;

import java.io.File;
import java.util.Locale;

/**
 * @author huangzuwang
 * @Date: 2019/4/14
 * @Description:
 */
public class MyViewResolver {

    private final String DEFAULT_TEMPLATE_SUFFX = ".html";

    private File templateRootDir;
//    private String viewName;

    public MyViewResolver(String templateRoot) {
        String templateRootPath = this.getClass().getClassLoader().getResource(templateRoot).getFile();
        templateRootDir = new File(templateRootPath);
    }

    public MyView resolveViewName(String viewName, Locale locale) throws Exception{
        if(null == viewName || "".equals(viewName.trim())){return null;}
        viewName = viewName.endsWith(DEFAULT_TEMPLATE_SUFFX) ? viewName : (viewName + DEFAULT_TEMPLATE_SUFFX);
        File templateFile = new File((templateRootDir.getPath() + "/" + viewName).replaceAll("/+","/"));
        return new MyView(templateFile);
    }
}
