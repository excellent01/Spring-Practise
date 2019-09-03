package com.github.excellent.dao;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @auther plg
 * @date 2019/8/23 9:22
 */
@Data
public class Account implements Serializable {
    private int id;
    private String name;
    private String balance;
}
