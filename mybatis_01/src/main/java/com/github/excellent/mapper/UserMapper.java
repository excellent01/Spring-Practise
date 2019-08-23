package com.github.excellent.mapper;

import com.github.excellent.dao.User;

import java.util.*;

public interface UserMapper {
    List<User> findAll();
    User selectById(int id);
    void insert(User user);
    List<User> findAll2();
}
