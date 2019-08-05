package com.xust.excellent.review;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/8/5 19:05
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);
    }
}
