package com.xust.spring.config;

import com.xust.spring.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther plg
 * @date 2019/7/29 15:08
 */

@Configuration
public class BeanConfiger {
    public Bean getBeanObject(){
        Bean bean = new Bean();
        bean.setFlag(true);
        bean.setStr("hello");
        bean.setThread(new Thread(()->{
            System.out.println("start");
        }));
        bean.setThreadLocal(new ThreadLocal());
        return bean;
    }
}
