package com.github.excellent.controller;

import com.github.excellent.po.User;
import com.github.excellent.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @auther plg
 * @date 2019/8/13 8:32
 */
@Controller
public class UserController2 {
    @Autowired
    private UserService service;
    @RequestMapping(value = "/show")
    public ModelAndView controller(){
        List<User> list = service.queryUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("showuser");
        return modelAndView;
    }
}
