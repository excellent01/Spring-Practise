package com.github.excellent.service.impl;
import com.github.excellent.mapper.UserMapper;
import com.github.excellent.po.User;
import com.github.excellent.service.IUserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @auther plg
 * @date 2019/8/18 1:39
 */

@Service
public class UserServiceImpl implements IUserService {
    private static SqlSessionFactory factory = null;
    static {
        try {
            InputStream in = Resources.getResourceAsStream("SqlMapperConfiger.xml");
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<User> findAll() throws Exception {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.findAll();
        sqlSession.close();
        return list;
    }

    @Override
    public List<User> BlurSearch(User user) throws Exception {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.BlurSearch(user);
        for(User user1 : list){
            System.out.println(user1);
        }
        sqlSession.close();
        return list;
    }
}
