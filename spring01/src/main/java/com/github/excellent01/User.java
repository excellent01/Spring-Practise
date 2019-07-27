package com.github.excellent01;

import com.github.excellent01.configer.ConfigerUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/7/27 21:44
 */
public class User {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(){

    }

    public User(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-ContextDemo1.xml");
        System.out.println(context.getBean("user1"));

        AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext(ConfigerUser.class);
        System.out.println(context.getBean("user"));
    }
}
