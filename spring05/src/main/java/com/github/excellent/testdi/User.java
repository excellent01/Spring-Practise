package com.github.excellent.testdi;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @auther plg
 * @date 2019/8/5 19:59
 */
@Data
@Component

public class User {
    @Autowired
    private Computer computer;
    @Value("100")
    private Integer age;
    @Qualifier("stu")
    private Stu stu;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(context.getBean(User.class));
    }
}
@Data
@Component("stu")
class Stu{
    private String name;

}
