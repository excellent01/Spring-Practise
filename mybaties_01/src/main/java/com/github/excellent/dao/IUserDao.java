package com.github.excellent.dao;

import com.github.excellent.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
