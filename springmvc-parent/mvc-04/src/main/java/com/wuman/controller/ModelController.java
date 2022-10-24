package com.wuman.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 开发中，和使用父子容器的问题一样，控制器携带request/session这两个参数都会导致控制器与这两者的耦合
 * 在SpringMVC中，Spring开发者先提出了一个ModelMap的类，来解决request/session这两者之间的耦合
 * 但是ModelMap的缺点是无法适配WebFlux，所以在后面的版本，SpringMVC更新了一个Model的概念，用于适配WebFlux模式的开发
 * 而为什么不把ModelMap删除，是因为Spring考虑对旧项目的兼容的问题，这是很好的处理方式，类似Python2/Python3就极为不同，几乎需要开发者重新学习一门语言
 *
 * 至于为什么这里只提到三大作用域request/session/applicationContext（ServletContext）的其中两者
 * 是因为上述三大作用域，SpringMVC开发只会用到前两者
 * 而ServletContext是更多用于底层框架的开发的，比如Spring的工厂、连接数据库的sqlSessionFactoryBean，一般的开发者根本用不到
 * @author lmf
 * @version 1.0
 * @date 2022/10/24 17:04
 */
@Controller
@RequestMapping("/model")
@SessionAttributes(value = {"name","address"})//此注解使model中的属性可以添加至session，值得注意的是这里的value填了不存在的也没事
//并且即使添加进了session里，其实引用也是和request里是一样的引用
public class ModelController {

    @RequestMapping
    public String model(Model model){
        model.addAttribute("age",10);
        model.addAttribute("name","wuman");
        return "model";
    }
}
