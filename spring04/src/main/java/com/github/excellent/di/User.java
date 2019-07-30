package com.github.excellent.di;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;

/**
 * @auther plg
 * @date 2019/7/30 12:36
 */

@Data
public class User {
    private String name;
    private Integer age;
    private Date birthday;


    public User( Integer age,String name, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public User(){
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        User user = (User) context.getBean("user1");
        System.out.println(user);
    }
}
