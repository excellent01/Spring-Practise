package com.excellent.mapper;

import com.excellent.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    
    List<User> findAll();
    List<User> find(@Param("user") User user);
    ArrayList<Map> findById(@Param("list") List<Integer> list);
    void adduser(@Param("user") User user);
    User search(@Param("id") int id);
    int insertUser( @Param("user") User user);

}
