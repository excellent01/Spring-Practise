package com.github.excellent.dao;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @auther plg
 * @date 2019/8/23 9:22
 */
@Data
public class Account {
    private int id;
    private String name;
    private String balance;
}
