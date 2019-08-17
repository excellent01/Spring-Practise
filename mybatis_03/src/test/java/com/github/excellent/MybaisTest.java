package com.github.excellent;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @auther plg
 * @date 2019/8/16 12:38
 */
public class MybaisTest {

    private SqlSessionFactory factory = null;
    @Before
    public void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMaperConfiger.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
    }
    @Test
    public void test() throws Exception {
        SqlSession sqlSession = factory.openSession();
        User1Maper mapper = sqlSession.getMapper(User1Maper.class);
        User user = new User();
        user.setId(10);
        List<User> list = mapper.selectByIdd(user);
        for(User user1 : list){
            System.out.println(user1);
        }

    }

    @Test
    public void test2(){
        SqlSession sqlSession = factory.openSession();
        User1Maper mapper = sqlSession.getMapper(User1Maper.class);
        User user = new User();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(16);
        list.add(22);
        list.add(25);

        user.setList(list);
        List<User> list1 = mapper.selectMore(user);
        for(User user1 : list1){
            System.out.println(user1);
        }
    }

}
