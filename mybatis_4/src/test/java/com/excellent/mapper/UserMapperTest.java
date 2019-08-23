package com.excellent.mapper;
import com.excellent.bz.UserBz;
import com.excellent.ex.OrdersEx;
import com.excellent.po.Orders;
import com.excellent.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    private SqlSessionFactory factory = null;
    @Before
    public void initTest(){
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(in);
    }

    @Test
    public void testFindAll(){
        SqlSession sqlSession = factory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.findAll();
        for(User user : list){
            System.out.println(user);
        }
    }

    @Test
    public void test3(){
        SqlSession sqlSession = factory.openSession();

        OrdersMaper mapper = sqlSession.getMapper(OrdersMaper.class);
        System.out.println(mapper.queryOrderToUser());


    }

    @Test
    public void test4(){
        SqlSession sqlSession = factory.openSession();

        OrdersMaper mapper = sqlSession.getMapper(OrdersMaper.class);
        List<Orders> list = mapper.queryOrderToUser2();
        System.out.println(list);

    }

    @Test
    public void test5(){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(16);
        list.add(22);

        ArrayList<Map> list1 = mapper.findById(list);
        for(Map map : list1){
            System.out.println(map);
        }
    }

    @Test
    public void test6(){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(10);
        user.setSex("1");
        List<User> list = mapper.find(user);
        for(User user1 : list){
            System.out.println(user1);
        }
        sqlSession.close();

    }

    @Test
    public void test7(){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(10);
        user.setUsername("op");
        user.setSex("1");
        mapper.adduser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test8(){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User u1 = mapper.search(1);
        System.out.println(u1);
        System.out.println("=================");
        //sqlSession.commit();
        User u2 = mapper.search(1);
        System.out.println(u2);
    }

    @Test
    public void test9(){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("qqq");
        mapper.insertUser(user);
        System.out.println("=========================");
        System.out.println(user.getId());
        sqlSession.commit();

    }


}