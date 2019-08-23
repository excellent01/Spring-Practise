package com.excellent.bz;

import com.excellent.ex.UserEx;

/**
 * 包装类
 * @auther plg
 * @date 2019/8/16 23:19
 */
public class UserBz {
    private UserEx userEx;

    public UserEx getUserEx() {
        return userEx;
    }

    public void setUserEx(UserEx userEx) {
        this.userEx = userEx;
    }

    @Override
    public String toString() {
        return "UserBz{" +
                "userEx=" + userEx +
                '}';
    }
}
