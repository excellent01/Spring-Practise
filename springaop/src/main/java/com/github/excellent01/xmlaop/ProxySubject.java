package com.github.excellent01.xmlaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @auther plg
 * @date 2019/8/1 15:45
 */

public class ProxySubject  {
    private void pointCut(){
    }

    public void checkBefore(){
        System.out.println("真正业务执行之前....");
    }

    public void checkAfter(){
        System.out.println("真正业务执行之后....");
    }
}
