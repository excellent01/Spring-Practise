package com.github.excellent.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther plg
 * @date 2019/8/15 19:50
 */

/**
 * 实体类
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private Date birthday;
    private Character sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                '}';
    }
}
