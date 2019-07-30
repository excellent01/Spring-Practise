package com.github.excellent01;

import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/7/27 22:09
 */

@Data
public class Demo2 {
    private int num1;
    private short num2;
    private int num3;
    private long num4;
    public Demo2(){
    }
    public Demo2(int num1, short num2, int num3, long num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-ContextDemo1.xml");

        System.out.println(context.getBean("demo2"));


    }


}
