package com.xust.excellent.review;

import lombok.Data;

import java.util.Date;

/**
 * @auther plg
 * @date 2019/8/5 19:00
 */
@Data
public class User {
    private String name;
    private Integer age;
    private Date birthday;
    /**
     * 无参构造
     */
    public User(){}

    public User(String name,Integer age,Date birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;

    }

    public User(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
