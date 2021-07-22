package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;

import java.io.IOException;

/**
 * @author YANG
 * @create 2021-07-16 11:19
 */
public class RegisterServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        // 2.检查验证码是否正确 === 写死，要求验证码为abcde
        if ("abcde".equalsIgnoreCase(code)){
            //验证码正确
            //3.检查用户名是否正确
            if (userService.existsUsername(username)){
                //用户名已存在
                System.out.println("用户名" + username + "已存在");
                //跳回注册页面（使用请求转发）
                req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
            }else {
                // 用户名可用
                // 4.调用sercice保存到数据库中
                userService.registerUser(new User(null,username,password,email));
                // 5.跳转到注册成功页面
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req,resp);

            }
        }else {
            //验证码错误
            System.out.println("验证码【 " + code + " 】错误");
            //跳回注册页面（使用请求转发）
            req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
        }

    }
}
