package com.github.excellent01.review.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/8/8 8:38
 */

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("review2.xml");
        User user = (User) context.getBean("user");
        user.add();
        user.delete();
    }
}
