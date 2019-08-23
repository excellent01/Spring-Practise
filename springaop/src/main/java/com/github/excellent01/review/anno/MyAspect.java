package com.github.excellent01.review.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @auther plg
 * @date 2019/8/8 8:31
 */

@Aspect
public class MyAspect {
    @Before(value = "execution(* com.github.excellent01.review.anno.User.* (..))")
    public void before(){
        System.out.println("前置增强");
    }
    public void after(){
        System.out.println("后置增强");
    }
}
