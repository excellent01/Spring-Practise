package com.github.excellent.jdbc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * @auther plg
 * @date 2019/8/8 19:58
 */
public class JdbcDemo2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-Context.xml");
        JdbcTemplate template = (JdbcTemplate) context.getBean("template");
        int count = template.update("insert into account values(null,?,?)", "QQQ", 1000);
        System.out.println(count);
    }
}
