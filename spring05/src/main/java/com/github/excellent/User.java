package com.github.excellent;

import lombok.Data;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @auther plg
 * @date 2019/7/31 18:27
 */

@Data
@ComponentScan(value = "com.github.excellent")
@Configuration(value = "user")
public class User {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        System.out.println(context.getBean("user"));
    }
}
