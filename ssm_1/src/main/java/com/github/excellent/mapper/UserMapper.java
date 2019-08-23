package com.github.excellent.mapper;
import com.github.excellent.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
    List<User> BlurSearch(@Param("user") User user);
    // 必须添加@Param
    void updateuser(@Param("user") User user);
}
