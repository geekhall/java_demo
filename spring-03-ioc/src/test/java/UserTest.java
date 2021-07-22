import cn.geekhall.pojo.User;
import cn.geekhall.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * UserTest.java
 *
 * @author yiny
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user2 = (User) context.getBean("user2");
        System.out.println(user2);

        UserT u2 = (UserT) context.getBean("u2");
        System.out.println(u2);
    }
}
