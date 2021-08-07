package cn.geekhall;

import cn.geekhall.bean.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Springboot09RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {

        // 操作字符串，类似String
//        redisTemplate.opsForValue();

        // 操作List
//        redisTemplate.opsForList();


        // 获取Redis的连接对象
//        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
//        connection.flushDb();
//        connection.flushAll();

        redisTemplate.opsForValue().set("myKey", "极客堂");
        System.out.println(redisTemplate.opsForValue().get("myKey"));
    }

    @Test
    public void test() throws JsonProcessingException {
        // 真实的开发一般都使用Json来传递对象
        User user = new User("极客堂", 3);
//        String jsonUser = new ObjectMapper().writeValueAsString(user);
//        redisTemplate.opsForValue().set("user", jsonUser);
        redisTemplate.opsForValue().set("user", user);
        Object user1 = redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }

}
