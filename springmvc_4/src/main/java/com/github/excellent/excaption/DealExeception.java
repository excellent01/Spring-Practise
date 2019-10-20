package com.github.excellent.excaption;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther plg
 * @date 2019/10/14 13:25
 */
@ControllerAdvice
public class DealExeception {
    @ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView dealException(Exception e){
        ModelAndView mv = new ModelAndView();
        Map map = new HashMap();
        String s = e.getMessage();
        map.put("exception",s);
        mv.addObject("map",map);
        mv.setViewName("exception");
        return mv;
    }
}
