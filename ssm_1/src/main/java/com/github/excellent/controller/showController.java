package com.github.excellent.controller;

import com.github.excellent.po.User;
import com.github.excellent.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * @auther plg
 * @date 2019/8/17 21:51
 */
@Controller
public class showController {

    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/abc")
    public ModelAndView showList() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setUserId(10);
        List<User> list = userService.BlurSearch(user);
        modelAndView.addObject("list",list);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
