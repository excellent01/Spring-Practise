package com.github.excellent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.io.*;
import javax.servlet.http.HttpServletRequest;

/**
 * @auther plg
 * @date 2019/8/18 0:22
 */
@Controller

public class FileUpLode {
    @RequestMapping("/abcd")
    public ModelAndView fileUpLode(HttpServletRequest request){
        String realPath = request.getSession().getServletContext().getRealPath("/jsp/");
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdirs();
        }



        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("load");
        return modelAndView;
    }
}

