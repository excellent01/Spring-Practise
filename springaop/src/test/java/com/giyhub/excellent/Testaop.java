package com.giyhub.excellent;

import com.github.excellent01.aop.UserImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @auther plg
 * @date 2019/8/7 17:51
 */
@ContextConfiguration("classpath:aop3.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Testaop {

    @Resource(name="user")
    private UserImpl user;

    @Test
    public void test(){
        user.add();
        user.delete();
        user.find();
        user.modify();
    }

}
