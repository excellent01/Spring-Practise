package com.github.excellent.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @auther plg
 * @date 2019/8/8 19:45
 */
public class JdbcDemo1 {
    public static void main(String[] args) {
        DataSource ds = new DriverManagerDataSource();
        ((DriverManagerDataSource) ds).setDriverClassName("com.mysql.jdbc.Driver");
        ((DriverManagerDataSource) ds).setUrl("jdbc:mysql://localhost:3306/spring");
        ((DriverManagerDataSource) ds).setUsername("root");
        ((DriverManagerDataSource) ds).setPassword("like12345");
        JdbcTemplate template = new JdbcTemplate(ds);
        template.update("insert into account values(null,?,?)","FFF","6000");
    }


}
