package com.github.excellent01.annoaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther plg
 * @date 2019/8/1 15:45
 */
@Aspect
@Component(value = "proxySubject")
@Configuration
public class ProxySubject  {

    /**
     * 就是一个标识，标识pointCut
     */
    @Pointcut("execution(* work1*(..)) || execution(* work2*(..))")
    private void pointCut(){
    }

    @Before("pointCut()")
    public void checkBefore(){
        System.out.println("真正业务执行之前....");
    }

    @After("pointCut()")
    public void checkAfter(){
        System.out.println("真正业务执行之后....");
    }
}
