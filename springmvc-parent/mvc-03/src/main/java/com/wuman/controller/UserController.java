package com.wuman.controller;

import com.wuman.entity.User;
import com.wuman.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lmf
 * @version 1.0
 * @date 2022/10/21 14:30
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private final static Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public String register(User user) {
        log.info("{}is registering", user);
        userService.register(user);
        return "register";
    }

}
