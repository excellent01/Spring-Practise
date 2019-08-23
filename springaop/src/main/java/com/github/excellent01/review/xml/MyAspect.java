package com.github.excellent01.review.xml;

/**
 * @auther plg
 * @date 2019/8/8 8:31
 */
public class MyAspect {
    public void before(){
        System.out.println("前置增强");
    }
    public void after(){
        System.out.println("后置增强");
    }
}
