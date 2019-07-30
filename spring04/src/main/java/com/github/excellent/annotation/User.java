package com.github.excellent.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @auther plg
 * @date 2019/7/30 22:08
 */
@Data
//@Component(value = "user")   // 将当前类的对象存入Spring容器中
//@Controller(value = "user")
//@Service(value = "user")
@Repository(value = "user")
@Scope(value = "propertype")
public class User {
    @Value(value = "Jack")
    private String username;
    private String password;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
        System.out.println(context.getBean("bean"));
    }
}
