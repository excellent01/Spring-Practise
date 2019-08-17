package com.github.excellent;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface User1Maper {

    // 查
    List<User> selectById(int id);
    // 改
    void update(User user);
    // 增
    void add(User user);
    // 删
    void delete(User user);

    // 查
    List<User> selectByIdd(@Param("user") User user) throws Exception;

    // 个数
    int findTotal();

    List<User> selectMore(User user);
}
