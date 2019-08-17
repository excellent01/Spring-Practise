package com.github.excellent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther plg
 * @date 2019/8/13 15:09
 */


@Controller
@RequestMapping("/test")
public class HelloControler {
    // 决定请求的url
    @RequestMapping(path = "/hehe",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hello","hello");
        // 必须和对应的jsp名字一致
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
