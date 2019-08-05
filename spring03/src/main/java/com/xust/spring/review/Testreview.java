package com.xust.spring.review;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/8/5 18:20
 */
public class Testreview {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        IUser user1 = (IUser) context.getBean("user1");
        IUser user2 = (IUser) context.getBean("user2");
        System.out.println(user1 == user2);

        System.out.println(context.getBean("user3"));
        System.out.println(context.getBean("user4"));
    }

}
