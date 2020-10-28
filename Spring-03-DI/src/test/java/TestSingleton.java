import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingleton {
    @Test
    public void Test1(){
        /*<bean id="userc" class="com.kuang.pojo.User" c:name="狂神" c:age="18" scope="singleton"/>*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) context.getBean("userp");
        User user2 = (User) context.getBean("userp");
        System.out.println(user1==user2);
    }
}
