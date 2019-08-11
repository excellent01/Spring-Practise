package com.github.excellent;;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @auther plg
 * @date 2019/8/11 11:36
 */
/**
 *
 * Mybatis API
 *
 * SqlSeesionFactory  :  重量级对象，一个该对象代表一个数据库，创建SqlSession对象
 * SqlSession  ： Connection 的封装 轻量级对象
 *、
 */
public class MybatisTest {

    private SqlSessionFactory  sqlSessionFactory = null;

    @Before
    public void testInit(){
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testQueerById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("com.github.excellent.dao.IUserDao.queryUserById",1);
        System.out.println(user);
        sqlSession.close();

    }


    @Test
    public void testQueerByName(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("com.github.excellent.dao.IUserDao.queryUserByName","t");
        System.out.println(list);
        sqlSession.close();

    }



    @Test
    public void insertUser(){
        User user = new User();
        user.setId(5);
        user.setUsername("ls");
        user.setBirthday("2010-03-03");
        user.setSex('男');
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int count = sqlSession.insert("com.github.excellent.dao.IUserDao.insertUser",user);
        // 提交事务
        sqlSession.commit();
        System.out.println(count);
        sqlSession.close();
    }


    @Test
    public void updateUser(){
        User user = new User();
        user.setId(4);
        user.setUsername("ls");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int count = sqlSession.update("com.github.excellent.dao.IUserDao.update",user);
        // 提交事务
        sqlSession.commit();
        System.out.println(count);
        sqlSession.close();
    }


    @Test
    public void testDelete(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int count = sqlSession.delete("com.github.excellent.dao.IUserDao.delete", 1);
        sqlSession.commit();
        System.out.println(count);
    }


//    public static void main(String[] args) throws IOException {
//
//        // 1 读取配置文件
//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        // 2 创建SqlSessionFactory工厂
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(in);
//        // 3 使用工厂产生SqlSession对象
//        SqlSession sqlSession = factory.openSession();
//
//        // 4 使用session创建dao接口的代理对象
//        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
//
//        // 5 使用代理对象执行方法
//        List<User> list = userDao.findAll();
//        for(User u : list){
//            System.out.println(u);
//        }
//        sqlSession.close();
//        in.close();
//    }
}

