package com.github.excellent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/7/31 16:58
 */
public class Test {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        RealSubject realSubject = (RealSubject) context.getBean("readsubject");
        realSubject.add();
        realSubject.delete();
    }
}
