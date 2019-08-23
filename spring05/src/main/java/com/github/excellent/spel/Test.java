package com.github.excellent.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/8/7 13:05
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spel.xml");
        School school = (School) context.getBean("school");
        Student student =  (Student) context.getBean("student");
        System.out.println(school);
        System.out.println(student);

    }


}
