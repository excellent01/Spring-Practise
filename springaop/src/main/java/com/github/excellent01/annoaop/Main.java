package com.github.excellent01.annoaop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/8/1 15:41
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        //context = new AnnotationConfigApplicationContext();
        RealSubject realSubject = (RealSubject) context.getBean("realSubject");
        realSubject.work1();
        realSubject.work2();
    }
}
