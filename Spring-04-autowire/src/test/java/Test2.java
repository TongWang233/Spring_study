import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    /*当一个bean节点带有 autowire byName的属性时。
        将查找其类中所有的set方法名，例如setCat，
        获得将set去掉并且首字母小写的字符串，即cat。
        去spring容器中寻找是否有此字符串名称id的对象。
        如果有，就取出注入；如果没有，就报空指针异常。
    */
    @Test
    public void testMethodAutowire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
    }

    @Test
    public void testByType() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
    }
}

