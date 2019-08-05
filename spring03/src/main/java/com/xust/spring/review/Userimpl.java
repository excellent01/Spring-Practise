package com.xust.spring.review;

import java.util.Date;

/**
 * @auther plg
 * @date 2019/8/5 17:48
 */
public class Userimpl implements IUser{
    private String name;
    private Date birthday;

    /**
     * 无参构造
     */
    public Userimpl(){
        System.out.println("无参构造调用");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void printInfo() {

    }
}
