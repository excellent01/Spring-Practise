package com.github.excellent;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @auther plg
 * @date 2019/7/31 16:25
 */
@Aspect
@Configuration
@Component
public class MyAspect {

    @Pointcut("execution(* add*(..))")
    private void addMethod(){
    }

    @Pointcut("execution(* *(..))")
    private void allMethod(){

    }

    @Before(value = "addMethod()")
    public void checkSecurity(){
        System.out.println("==============checkSecurity()====================");
    }

    @After(value = "allMethod()")
    public void printLog(){
        System.out.println("============= 打印日志================");
    }
}
