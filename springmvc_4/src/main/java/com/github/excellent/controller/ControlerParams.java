package com.github.excellent.controller;
import com.github.excellent.po.Person;
import com.github.excellent.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
/**
 * @auther plg
 * @date 2019/8/13 17:13
 */
@Controller
public class ControlerParams {
    @RequestMapping("/test")
    // 提交的参数名称和方法参数名称相同,与参数顺序无关
    public ModelAndView test(String password,String username){
        System.out.println(username);
        System.out.println(password);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        return modelAndView;
    }

    @RequestMapping("/test2")
    // 封装javaBean，要求参数名称和javaBean属性相同
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

    @RequestMapping("/test4")
    // @RequestParam 解决参数名称不匹配的问题
    public ModelAndView test(@RequestParam(value = "username") String user){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(user);
        modelAndView.setViewName("test");
        return modelAndView;
    }

    @RequestMapping("/test5")
    // 获取请求体中的数据
    public ModelAndView test5(@RequestBody (required = true) String body){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(body);
        modelAndView.setViewName("test");
        return modelAndView;
    }

    @RequestMapping("/test6/{id}")
    public ModelAndView test6(@PathVariable(name="id") String id){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(id);
        modelAndView.setViewName("test");
        return modelAndView;
    }

    @RequestMapping("/test7")
    // 请求头中的数据
    public ModelAndView test7(@RequestHeader(value = "Hosti") String header){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(header);
        modelAndView.setViewName("test");
        return modelAndView;
    }

    /**
     * @CookieValue 注解
     * @param cookValue
     * @return
     */
    @RequestMapping("/test8")
    public ModelAndView tes8(@CookieValue("JSESSIONID") String cookValue){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(cookValue);
        modelAndView.setViewName("test");
        return modelAndView;
    }


    @RequestMapping("/test9")
    public ModelAndView tes9(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println();
        modelAndView.setViewName("test");
        return modelAndView;
    }

    /**
     * 提前初始化，即使不传值可以采用数据库中的值
     */
    @ModelAttribute
    public void before(){
        System.out.println("before ....");
    }



}
