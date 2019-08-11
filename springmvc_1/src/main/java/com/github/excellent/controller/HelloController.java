package com.github.excellent.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther plg
 * @date 2019/8/9 17:51
 */

// 定义一个控制器
@Controller
@RequestMapping(value = "/hello")
public class HelloController {
    @RequestMapping(path = "hello")
    public String sayHello(){
        System.out.println("hello Spring");
        return "hello";

    }
}
