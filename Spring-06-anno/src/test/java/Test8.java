import com.kuang05.pojo.Cat;
import com.kuang05.pojo.Dog;
import com.kuang05.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8 {
    @Test
    public void testCat(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");
        Cat cat= (Cat) applicationContext.getBean("cat");
        System.out.println(cat.name);
    }
    @Test
    public void testUser(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.name);
    }
    @Test
    public void testDog(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");
       Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.println(dog.name);
    }


}
