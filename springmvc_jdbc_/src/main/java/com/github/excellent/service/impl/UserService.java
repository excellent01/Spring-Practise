package com.github.excellent.service.impl;

import com.github.excellent.dao.UserDao;
import com.github.excellent.po.User;
import com.github.excellent.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther plg
 * @date 2019/8/12 9:30
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao dao;
    @Override
    public List<User> queryUser() {
        return dao.queryuser();
    }
}
