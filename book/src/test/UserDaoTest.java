package test;

import dao.impl.UserDaoImpl;
import org.junit.Test;
import pojo.User;

import static org.junit.Assert.*;

/**
 * @author YANG
 * @create 2021-07-15 23:45
 */
public class UserDaoTest {

    @Test
    public void queryUserByUsername() {
        UserDaoImpl userDao = new UserDaoImpl();
        User root = userDao.queryUserByUsername("root");
        if (root == null){
            System.out.println("用户名可用");
        }else {
            System.out.println("用户名已存在");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        UserDaoImpl userDao = new UserDaoImpl();
        User root = userDao.queryUserByUsernameAndPassword("root","123456");
        if (root == null){
            System.out.println("用户名或密码错误");
        }else {
            System.out.println("登录成功");
        }
    }

    @Test
    public void saveUser() {
        UserDaoImpl userDao = new UserDaoImpl();
        int i = userDao.saveUser(new User(null, "admin1", "12345678", "123456@qq.com"));
        System.out.println(i);
    }
}