package com.github.excellent01.configer;

import com.github.excellent01.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther plg
 * @date 2019/7/27 21:59
 */
@Configuration
public class ConfigerUser {
    @Bean(name="user")
    public User user(){
        User user = new User();
        user.setId(10);
        return user;
    }
}
