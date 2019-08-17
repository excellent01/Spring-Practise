package com.github.excellent.dao.impl;

import com.github.excellent.dao.UserDao;
import com.github.excellent.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @auther plg
 * @date 2019/8/15 21:38
 */
public class UserDaoimpl implements UserDao {
    @Override
    public List<User> findAll() throws IOException {

        InputStream in = Resources.getResourceAsStream("sqlMaperConfiger.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = factory.openSession();

        List<User> list = sqlSession.selectList("com.github.excellent.dao.UserDao.findAll");

        sqlSession.close();

        return list;
    }

    @Override
    public void saveUser(User use) {

    }

    @Override
    public List<User> query(String username) {
        return null;
    }

}
