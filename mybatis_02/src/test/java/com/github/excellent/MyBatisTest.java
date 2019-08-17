package com.github.excellent;
import com.github.excellent.dao.UserDao;
import com.github.excellent.dao.impl.UserDaoimpl;
import com.github.excellent.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @auther plg
 * @date 2019/8/15 20:10
 */
public class MyBatisTest {
    // 1 读取核心配置文件
    // 2 创建SqlSessionFactory工厂对象(创建SqlSessionFactoryBuilder --- 构建者模式)
    // 3 创建SqlSession对象 (工厂模式)  --- 操作数据库的对象
    // 4 创建UserDao接口对象
    // 5 执行查询
    // 6 释放资源


    private SqlSessionFactory factory = null;
   @Before
    public void init() throws IOException {
       InputStream in = Resources.getResourceAsStream("sqlMaperConfiger.xml");
       InputStream in1 = Resources.getResourceAsStream("sqlMaperConfiger2.xml");
       factory = new SqlSessionFactoryBuilder().build(in);
   }


    /**
     * 基于配置Maper动态代理
     */
    @Test
    public void testFindAll() throws IOException {
       SqlSession sqlSession = factory.openSession();
       UserDao user = sqlSession.getMapper(UserDao.class);
       List<User> list = user.findAll();
       for(User user1 : list){
           System.out.println(user1);
       }
       sqlSession.close();
   }

    /**
     * 基于注解
     * 去掉XXXMaper文件
     */
   @Test
    public void testFindAll2() throws IOException {
       SqlSession sqlSession = factory.openSession();
       UserDao mapper = sqlSession.getMapper(UserDao.class);
       List<User> list = mapper.findAll();
       for(User user : list){
           System.out.println(user);
       }
   }

    /**
     * 基于传统的dao
     * @throws IOException
     */
   @Test
    public void test3() throws IOException {
       UserDao userDao = new UserDaoimpl();
       List<User> all = userDao.findAll();
       System.out.println(all);
   }


   @Test
    public void testSave(){
       User user = new User();
       user.setUsername("hh");
       user.setBirthday(new Date());
       user.setSex('女');
       SqlSession sqlSession = factory.openSession();
       UserDao mapper = sqlSession.getMapper(UserDao.class);
       System.out.println("before" + user);
       mapper.saveUser(user);
       System.out.println("after" + user);
       sqlSession.commit();
       sqlSession.close();
   }


   @Test
    public void testQuery(){
       SqlSession sqlSession = factory.openSession();
       UserDao mapper = sqlSession.getMapper(UserDao.class);
       List<User> list = mapper.query("n");
       System.out.println(list);
   }

}
