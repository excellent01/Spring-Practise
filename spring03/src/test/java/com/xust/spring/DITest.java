package com.xust.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther plg
 * @date 2019/7/29 14:50
 */
public class DITest {
    private ApplicationContext context;
    @Before
    public void testInitial(){
        context = new ClassPathXmlApplicationContext("application-Context.xml");
    }
    @Test
    public void test(){
        DICollection di = (DICollection) context.getBean("collect");
        System.out.println(di);
        System.out.println(di.getMap().getClass());
        System.out.println(di.getList().getClass());
        System.out.println(di.getSet().getClass());
    }
}
