package com.github.excellent.controller;
import com.github.excellent.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.HeaderParam;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @auther plg
 * @date 2019/8/9 17:51
 */

// 定义一个控制器
@Controller
@RequestMapping(value = "/abc")
// @SessionAttributes(value = "user")
public class HelloController {

    @RequestMapping(value = {"/hello","/???"},method = RequestMethod.GET)
    public String sayHello(){
        System.out.println("hello Spring");
        return "hello";
    }
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String helloWOrld(){
        System.out.println("hello world");
        return "hello";
    }

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public String getName(@RequestParam(name = "name",required = true)String userName){
        System.out.println("hello world" + userName);
        return "hello";
    }
    @GetMapping(value = "/combine",params = {"id=1"})
    public String combine(Integer id){
        System.out.println("hello combine" + id);
        return "hello";
    }
    @RequestMapping(value = "/order/{uuid}",method = RequestMethod.POST)
    public String order(@PathVariable("uuid")String uuid){
        System.out.println("post 方式"+ uuid);
        return "hello";
    }
    @RequestMapping(value = "/order/{uuid}" ,method = RequestMethod.DELETE)
    public String orderDelete(@PathVariable("uuid") String uuid){
        System.out.println("delete 方式" + uuid);
        return "hello";
    }

    @RequestMapping(value = "/order/{uuid}" ,method = RequestMethod.HEAD)
    public String orderGet(@PathVariable("uuid") String uuid){
        System.out.println("put 方式" + uuid);
        return "hello";
    }
    @RequestMapping(value = "/header")
    public String getHeager(@HeaderParam("HOST") String host){
        System.out.println("put 方式" + host);
        return "hello";
    }

    @RequestMapping(value = "/cookie")
    public String getCookie(@CookieValue("JSESSIONID") String id){
        System.out.println(id);
        return "hello";
    }

    @RequestMapping(value = "/servlet")
    public String getCookie(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getParameter("name"));
        System.out.println(response.getHeader("Host"));
        return "hello";
    }
    @RequestMapping(value = "/modelandview")
    public ModelAndView getCookie(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",new ArrayList());
        mv.setViewName("hello");
        System.out.println("test model and view");
        return mv;
    }

    @RequestMapping(value = "/test")
    public String test(Map m1, Model m2, ModelMap m3){
        m1.put("m1",m1);
        m2.addAttribute("m2",m2);
        m3.addAttribute("m3",m3);
        System.out.println(m1 == m2);
        System.out.println(m2 == m3);
        System.out.println(m1 == m3);
        System.out.println(m1.getClass().getName());
        System.out.println(m2.getClass().getName());
        System.out.println(m3.getClass().getName());

        return "hello";
    }

    @RequestMapping("/date")
    public String date(Map map){
        Date date = new Date();
        map.put("date",date);
        System.out.println(date);
        return "hello";
    }
    @RequestMapping("/testUser")
    public String test( User user){
        System.out.println(user);
        return "hello";
    }

    @ModelAttribute
    public void before(@RequestParam(value = "id",required = false) Integer id,Map<String,Object> map){
        if(id == null){
            return;
        }
        System.out.println("before....");
        User user = new User();
        user.setPassword("123");
        user.setUserName("lisi");
        map.put("user",user);
    }

    @RequestMapping("/uplode")
    public String uplode(MultipartFile file) throws IOException {
        System.out.println("test uplode....");
        String extendName = file.getName().substring(file.getName().lastIndexOf("."));
        file.transferTo(new File("C:\\" + UUID.randomUUID() + extendName));
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/response")
    public List<String> testResponseBode(){
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("C++");
        return list;
    }







}
