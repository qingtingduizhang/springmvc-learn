package com.wuman;

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
public class FirstController {

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
