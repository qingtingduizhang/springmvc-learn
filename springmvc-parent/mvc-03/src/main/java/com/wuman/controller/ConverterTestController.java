package com.wuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

/**
 * @author lmf
 * @version 1.0
 * @date 2022/10/20 14:51
 */
@Controller
public class ConverterTestController {


    @PostMapping("/convert")
    public String convert(String name, Date birthday){
        System.out.println("name = " + name);
        System.out.println("birthday = " + birthday);
        return "index";
    }
}
