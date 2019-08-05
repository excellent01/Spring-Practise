package com.github.excellent01.xmlaop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @auther plg
 * @date 2019/8/1 15:41
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
        System.out.println( context.getBean("proxy").getClass().getName());
        System.out.println(context.getBean("real").getClass().getName());
        RealSubject bean = (RealSubject) context.getBean("real");
        bean.work1();
        bean.work2();
    }
}
