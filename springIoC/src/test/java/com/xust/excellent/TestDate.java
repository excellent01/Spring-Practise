package com.xust.excellent;
import com.xust.excellent.review.Bean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;

/**
 * @auther plg
 * @date 2019/8/10 20:24
 */
public class TestDate {
    private ApplicationContext context = null;
    @Before
    public void init(){
         context = new ClassPathXmlApplicationContext("bean.xml");
    }
    @Test
    public void test(){
        Bean bean = (Bean) context.getBean("bean");
        System.out.println(bean);
    }

}
