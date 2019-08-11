package com.github.excellent;
import com.github.excellent.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @auther plg
 * @date 2019/8/11 11:36
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        // 1 读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 3 使用工厂产生SqlSession对象
        SqlSession sqlSession = factory.openSession();

        // 4 使用session创建dao接口的代理对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 5 使用代理对象执行方法
        List<User> list = userDao.findAll();
        for(User u : list){
            System.out.println(u);
        }
        sqlSession.close();
        in.close();
    }
}
