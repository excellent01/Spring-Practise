package com.github.excellent.dao;
/**
 * @auther plg
 * @date 2019/8/15 19:59
 */
import com.github.excellent.domain.User;
import java.io.IOException;
import java.util.List;

/**
 * dao接口
 */
public interface UserDao {

    List<User> findAll() throws IOException;

    void saveUser(User use);

    List<User> query(String username);

}
