package com.wuman.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 与Servlet开发不同，SpringMVC的控制器，即@Controller注入的DispatcherServlet不实现类似Servlet的HttpServlet接口
 * 所以其一个控制器，可以实现多个方法，实现多个服务
 * 而Servlet因为只能实现HttpServlet中service方法的原因，一个Servlet类只能有一个服务方法，即重写的service()
 * @author lmf
 * @version 1.0
 * @date 2022/10/13 14:27
 */
@Controller
//@Scope("singleton")
//@Scope("prototype") 次注解控制控制器创建的次数，singleton是一次，prototype是多次
public class FirstController {

    /**
     * 注解RequestMapping可进行多路径指定/限定请求方式/省略第一层级的'/'
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/first")
    public String first(HttpServletRequest request, HttpServletResponse response){
        System.out.println("springmvc is running...");
        return "/result.jsp";
    }

    @RequestMapping("/second")
    public String second(HttpServletRequest request, HttpServletResponse response){
        System.out.println("FirstController.second");
        return "/result.jsp";
    }
}
