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
 * @create 2021-07-16 22:02
 */
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 2.调用userService.login()登录处理业务
        User user = userService.login(new User(null, username, password, null));

        if (user == null){
            System.out.println("登录失败");
            req.getRequestDispatcher("pages/user/login.html").forward(req,resp);
        }else{
            System.out.println("登录成功");
            req.getRequestDispatcher("pages/user/login_success.html").forward(req,resp);
        }

    }
}
