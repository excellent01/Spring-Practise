package com.github.excellent.dao;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther plg
 * @date 2019/8/23 21:11
 */
@Data
public class Orders implements Serializable {
    private int id;
    private int userId;
    private String number;
    private Date createTime;
    private String note;
}
