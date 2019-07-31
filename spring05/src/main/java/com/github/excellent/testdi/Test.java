package com.github.excellent.testdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/7/31 21:52
 */
public class Test {

    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("computer.xml");
        AnnotationConfigApplicationContext contextAnno = new AnnotationConfigApplicationContext(Computer.class);
        /**
         * 1 通过反射调用构造方法创建
         */
        //Computer computer = (Computer) context.getBean("computer");

        /**
         * 2、工厂
         *     - 静态工厂
         *     - 普通工厂
         * 3、注解
         */
        Computer computer = (Computer) context.getBean("computer");
        System.out.println(computer);

        computer = (Computer) contextAnno.getBean("computer");
       Computer computer1 = (Computer) contextAnno.getBean(Computer.class);
        System.out.println(computer.hashCode() );
        System.out.println(computer1.hashCode());
    }
}
