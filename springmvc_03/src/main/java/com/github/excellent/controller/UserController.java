package com.github.excellent.controller;
import com.github.excellent.po.User;
import com.github.excellent.service.impl.UserService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


/**
 * @auther plg
 * @date 2019/8/12 9:31
 */
public class UserController implements Controller {

    private UserService service = new UserService();

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<User> list = service.queryUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
