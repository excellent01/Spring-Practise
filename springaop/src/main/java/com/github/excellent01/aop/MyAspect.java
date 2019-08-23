package com.github.excellent01.aop;

import org.aspectj.lang.JoinPoint;

/**
 * 切面类
 * @auther plg
 * @date 2019/8/7 17:59
 */
public class MyAspect {
    public void checkPri(){
        System.out.println("权限校验...");
    }

    public void log(JoinPoint joinPoint){
        System.out.println("日志记录..." + joinPoint);
    }
}
