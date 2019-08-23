import com.github.excellent.mapper.UserMapper;
import com.github.excellent.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.util.Date;

/**
 * @auther plg
 * @date 2019/8/21 10:36
 */
public class mybatisTest {
    private SqlSessionFactory factory = null;

    @Before
    public void init() throws IOException {
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapperConfiger.xml"));
    }

    @Test
    public void test(){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setBirthday(new Date());
        user.setUserAddr("xa");
        mapper.updateuser(user);
        sqlSession.commit();
        sqlSession.close();
    }
}
