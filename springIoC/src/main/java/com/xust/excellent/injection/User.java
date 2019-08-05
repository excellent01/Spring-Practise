package com.xust.excellent.injection;

import com.xust.excellent.config.BeanConfig;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 通过注解初始化bean
 * @auther plg
 * @date 2019/7/27 20:27
 */
@Data
public class User {
    private Integer id;
    private String username;
    public User(){
    }

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

}
