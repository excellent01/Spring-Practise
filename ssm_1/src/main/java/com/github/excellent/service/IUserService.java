package com.github.excellent.service;

import com.github.excellent.po.User;

import java.util.List;

public interface IUserService {
    List<User> findAll() throws Exception;
    List<User> BlurSearch(User user) throws Exception;

}
