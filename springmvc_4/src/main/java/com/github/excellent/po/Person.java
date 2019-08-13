package com.github.excellent.po;

import lombok.Data;

import java.util.Date;

/**
 * @auther plg
 * @date 2019/8/13 17:43
 */
@Data
public class Person {
    private User user;
    private Date date;
}
