package com.github.excellent.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * @auther plg
 * @date 2019/8/8 20:26
 */
public class JdbcDemo3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-Context.xml");
        JdbcTemplate template = (JdbcTemplate) context.getBean("template");

        List<Map<String, Object>> maps = template.queryForList("select * from account");
        System.out.println(maps);
    }
}
