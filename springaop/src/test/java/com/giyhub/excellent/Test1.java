package com.giyhub.excellent;
import com.github.excellent01.a.annotationaop.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

/**
 * @auther plg
 * @date 2019/8/7 19:23
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop4.xml")
public class Test1 {

    @Resource(name="user")
    private User user;

    @Test
    public void test(){
        user.delete();
    }
}
