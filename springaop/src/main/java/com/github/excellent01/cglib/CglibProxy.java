package com.github.excellent01.cglib;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * @auther plg
 * @date 2019/8/7 17:04
 * 基于cglib的动态代理
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(method.getName().equals("add")){
            System.out.println("权限检查。。");
        }
        return methodProxy.invoke(target,objects);
    }

    public Object getProxyInstance(){
        //1 创建核心对象
        Enhancer enhancer = new Enhancer();
        //2 设置父类
        enhancer.setSuperclass(target.getClass());
        //3 设置回调
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    public static void main(String[] args) {
        User user = new User();
        CglibProxy cglibProxy = new CglibProxy(user);
        User temp = (User) cglibProxy.getProxyInstance();
        temp.add();
    }
}
