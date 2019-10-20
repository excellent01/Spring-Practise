package com.github.excellent.controller;
import com.github.excellent.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther plg
 * @date 2019/8/13 17:38
 */
@Controller
@RequestMapping("/abc")
@SessionAttributes("user")
public class ControllerParams2 {
    @RequestMapping("/ab")
        public ModelAndView test(){
            ModelAndView modelAndView =  new ModelAndView();
        User user = new User();
        user.setUsername("root");
        user.setPassword("root");
        modelAndView.setViewName("session");
        return modelAndView;
    }
}
