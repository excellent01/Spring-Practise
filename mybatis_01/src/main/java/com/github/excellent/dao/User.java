package com.github.excellent.dao;

import lombok.Data;

import java.io.Serializable;

/**
 * @auther plg
 * @date 2019/8/23 14:39
 */
@Data
public class User implements Serializable {
    private int userId;
    private String userName;
    private String userBirthday;
    private String userSex;
    private String userAdd;
    private Orders orders;
}
