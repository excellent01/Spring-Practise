package com.github.excellent01.dynimicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther plg
 * @date 2019/8/1 15:45
 */
public class ProxySubject implements InvocationHandler {

    private Object target;

    public ProxySubject(Object target){
        this.target = target;
    }

    public Object getProxyIntance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        before();
        obj =  method.invoke(target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("真实业务之前。。。");
    }
    private void after(){
        System.out.println("真实业务之后。。。");
    }


}
