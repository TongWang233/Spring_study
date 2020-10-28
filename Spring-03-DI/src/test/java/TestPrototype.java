import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrototype {
    @Test
    public void Test1(){
        /*<bean id="userPrototype" class="com.kuang.pojo.User" c:name="狂神" c:age="18" scope="Prototype"/> (原型模式)*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) context.getBean("userPrototype");
        User user2 = (User) context.getBean("userPrototype");
        System.out.println(user1==user2);
    }
}
