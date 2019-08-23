package com.github.excellent01.annotationaop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @auther plg
 * @date 2019/8/7 19:16
 */

@Aspect
public class MyAspect {

   //  指明增强的方法
    @Before(value = "execution(* com.github.excellent01.annotationaop.User.*(..))")
    public void before(){
        System.out.println("前置增强");
    }

    @Before(value = "execution(* com.github.excellent01.annotationaop.User.*(..))")
    public void after(){
        System.out.println("后置增强");
    }
}
