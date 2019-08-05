package com.xust.excellent.config;

import com.xust.excellent.injection.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther plg
 * @date 2019/7/27 20:26
 */
@Configuration
@ComponentScan(basePackages = "com.xust.excellent")
public class BeanConfig {
    @Bean(name = "user")
    public User getUserObject(){
        User user = new User();
        user.setId(0);
        user.setUsername("Jack");
        return user;
    }
}
