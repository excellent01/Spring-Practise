package com.github.excellent;

import com.github.excellent.dao.Account;
import com.github.excellent.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest{
    private SqlSessionFactory factory = null;
    @Before
    public void init(){
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(in);
    }
    @Test
    public void test1(){
        SqlSession sqlSession = factory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = new Account();
        account.setBalance("3000");
        account.setName("ddd");
        mapper.insert(account);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession1 = factory.openSession();
        SqlSession sqlSession2 = factory.openSession();
        SqlSession sqlSession3 = factory.openSession();
        System.out.println("第一次查询：");
        AccountMapper mapper1 = sqlSession1.getMapper(AccountMapper.class);
        List<Account> list1 = mapper1.select();
        for(Account account1 : list1){
            System.out.println(account1);
        }
        sqlSession1.close();
        System.out.println("第二次查询：");

        AccountMapper mapper2 = sqlSession2.getMapper(AccountMapper.class);
        List<Account> list2 = mapper2.select();
        for(Account account1 : list2){
            System.out.println(account1);
        }

        System.out.println("第三次查询：");

        AccountMapper mapper3 = sqlSession3.getMapper(AccountMapper.class);
        List<Account> list3 = mapper3.select();
        for(Account account1 : list3){
            System.out.println(account1);
        }

    }

    @Test
    public void test3(){
        SqlSession sqlSession = factory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = mapper.selectById(2);
        System.out.println(account);
        System.out.println("============================");
        AccountMapper mapper1 = sqlSession.getMapper(AccountMapper.class);
        Account account1 = mapper1.selectById(2);
        System.out.println(account);
        sqlSession.close();
    }

    @Test
    public void test4(){
        SqlSession sqlSession = factory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Map<String,String> map = new HashMap<>();
        map.put("name","cc");
        List<Account> list = mapper.seelctByMap(map);
        System.out.println(list);
        sqlSession.close();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = factory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = new Account();
        account.setName("ccc");
        account.setId(3);
        List<Account> list = mapper.seelctByJavaBean(account);
        System.out.println(list);
        sqlSession.close();
    }
}