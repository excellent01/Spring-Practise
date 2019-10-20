package com.github.excellent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import java.io.*;
import java.io.IOException;
import java.util.*;

/**
 * @auther plg
 * @date 2019/8/27 15:22
 * 文件上传
 */
@Controller
public class Controller3 {
    @RequestMapping("/upload")
    public ModelAndView upload(@RequestParam("head") MultipartFile multipartFile) throws IOException {
        String fileName = multipartFile.getOriginalFilename();
        String extendName = fileName.substring(fileName.lastIndexOf("."));
        File file = new File("c:\\" + UUID.randomUUID()+extendName);
        multipartFile.transferTo(file);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        return modelAndView;
    }

    @RequestMapping("/excepton")
    public ModelAndView testException(@RequestParam("userName")String userName){
        if(userName == ""){
            throw new RequestParameterInvalidException();
        }
        System.out.println(userName);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }
    // 自定义异常类
    @ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "hello Parameter Invalid")
    class RequestParameterInvalidException extends RuntimeException{

    }

    @RequestMapping("/exception")
    public String testException(@RequestParam("age") int age){
        System.out.println("1111----");
        int result = 10 / age;
        return "test";
    }

    @ResponseBody
    @RequestMapping("/response")
    public List<String> testResponseBode(){
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("C++");
        return list;
    }

//    @ExceptionHandler(value = {ArithmeticException.class})
//    public ModelAndView dealException(Exception e){
//        ModelAndView mv = new ModelAndView();
//        Map map = new HashMap();
//        String s = e.getMessage();
//        map.put("exception",s);
//        mv.addObject("map",map);
//        mv.setViewName("exception");
//        return mv;
//    }

    @RequestMapping("forward")
    public String testForward(){
        return "forward:/jsp/exception.jsp";
    }

    @RequestMapping("/redirect")
    public String testRedirect(){
        return "redirect:/jsp/person.jsp";
    }


}
