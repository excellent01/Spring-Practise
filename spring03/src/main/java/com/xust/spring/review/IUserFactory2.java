package com.xust.spring.review;

/**
 * 普通工厂
 * @auther plg
 * @date 2019/8/5 18:19
 */
public class IUserFactory2 {
    public Userimpl getInstance(){
        return new Userimpl();
    }
}
