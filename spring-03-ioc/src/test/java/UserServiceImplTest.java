import cn.geekhall.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * UserServiceImplTest.java
 *
 * @author yiny
 */
public class UserServiceImplTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
