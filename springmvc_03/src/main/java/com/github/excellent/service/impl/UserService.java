package com.github.excellent.service.impl;

import com.github.excellent.dao.UserDao;
import com.github.excellent.po.User;
import com.github.excellent.service.IUserService;

import java.util.List;

/**
 * @auther plg
 * @date 2019/8/12 9:30
 */
public class UserService implements IUserService {
    private UserDao dao = new UserDao();
    @Override
    public List<User> queryUser() {
        return dao.queryuser();
    }
}
