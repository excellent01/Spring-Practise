package com.xust.spring;

import com.xust.spring.config.BeanConfiger;
import lombok.Data;

/**
 * @auther plg
 * @date 2019/7/29 15:08
 */
@Data
public class Bean {
    private Thread thread;
    private ThreadLocal threadLocal;
    private String str;
    private boolean flag;

    public Bean(){

    }

    public static void main(String[] args) {
        BeanConfiger configer = new BeanConfiger();
        Bean beanObject = configer.getBeanObject();
        System.out.println(beanObject);


    }
}
