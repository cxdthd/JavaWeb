package test;

import org.junit.Test;
import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;


/**
 * @author YANG
 * @create 2021-07-16 10:59
 */
public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registerUser() {
        userService.registerUser(new User(null,"root1","123456","123@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"root11","123456","a")));
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("root3")){
            System.out.println("用户名已存在");
        }else {
            System.out.println("用户名可使用");
        }
    }
}