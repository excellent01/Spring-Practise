package com.github.excellent;
import com.github.excellent.dao.User;
import com.github.excellent.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @auther plg
 * @date 2019/8/23 14:45
 */
public class MybatisTest2 {
    private SqlSessionFactory factory = null;
    @Before
    public void init(){
        try {
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        SqlSession sqlSession1 = factory.openSession();
        SqlSession sqlSession2  = factory.openSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        List<User> list1 = mapper1.findAll();
        for(User user : list1){
            System.out.println(user);
        }
        
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        List<User> list2 = mapper1.findAll();
        System.out.println("===================");
        for(User user : list2){
            System.out.println(user);
        }

    }

    @Test
    public void test3(){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.selectById(10));
        sqlSession.close();
    }

    @Test
    public void test4(){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUserName("plgh");
        mapper.insert(user);
        sqlSession.commit();
        System.out.println(user.getUserId());
        sqlSession.close();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.findAll2();
        for(User user : list){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
