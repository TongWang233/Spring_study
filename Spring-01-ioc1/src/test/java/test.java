import com.kuang.dao.impl.UserDaoMySqlImpl;
import com.kuang.dao.impl.UserDaoOracleImpl;
import com.kuang.service.UserService;
import com.kuang.service.impl.UserServiceImpl;
import org.junit.Test;

public class test {
    @Test
    public void test17(){
        UserService service = new UserServiceImpl();
        service.getUser();
    }

    @Test
    public void test2(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao( new UserDaoMySqlImpl() );
        service.getUser();
        //那我们现在又想用Oracle去实现呢
        service.setUserDao( new UserDaoOracleImpl() );
        service.getUser();
    }
}