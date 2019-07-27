package com.github.excellent01;

import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/7/27 21:20
 */

@Data
public class SpringDemo1 {
    private Integer id;
    private String name;
    private Boolean flag;
    private Byte aByte;

    public SpringDemo1(){

    }
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-ContextDemo1.xml");
        SpringDemo1 demo1 = (SpringDemo1) context.getBean("demo1");
        System.out.println(demo1);
    }
}
