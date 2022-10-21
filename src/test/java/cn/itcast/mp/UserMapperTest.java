package cn.itcast.mp;

import cn.itcast.mp.mapper.UserMapper;
import cn.itcast.mp.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        List<User> list = userMapper.selectList(null);
        for (User user : list){
            System.out.println(user.getUserName());
        }
    }

    //使用@TableId注解，设置主键生成模式
        @Test
        public void testInsert(){
            User user=new User();
            user.setUserName("xienian");
            user.setPassword("root");
            int count = this.userMapper.insert(user);
            System.out.println("插入了:"+count+"行；ID为："+user.getId());
        }
}
