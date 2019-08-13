package com.github.excellent.controller;
import com.github.excellent.po.Person;
import com.github.excellent.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther plg
 * @date 2019/8/13 17:13
 */
@Controller
public class ControlerParams {
    @RequestMapping("/test")
    public ModelAndView test(String username,String password){
        System.out.println(username);
        System.out.println(password);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        return modelAndView;
    }

    @RequestMapping("/test2")
    public ModelAndView test(User user){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(user);
        modelAndView.setViewName("test");
        return modelAndView;
    }


    @RequestMapping("/test3")
    public ModelAndView test(Person person){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(person);
        modelAndView.setViewName("test");
        return modelAndView;
    }



}
