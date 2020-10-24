import com.kuang.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
        @Test
        public void test2(){
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
            serviceImpl.getUser();
    }
}
