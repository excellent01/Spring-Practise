package com.xust.spring.review;

/**
 * 静态工厂
 * @auther plg
 * @date 2019/8/5 18:16
 */
public class IUserFactory {

    /**
     * 无参构造
     */
    public IUserFactory(){}

    public static IUser getInstance(){
        return new Userimpl();
    }
}
