package servlet0;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author YANG
 * @create 2021-07-14 21:39
 */
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取请求的参数（办事的材料）查看
        String username = req.getParameter("username");
        System.out.println("在Servlet1（柜台1）查看参数userame=" + username);

        // 给材料盖一个章，并传递到Servlet2（柜台2）去查看
        req.setAttribute("key1","柜台1的章");

        // 问路：Servlet2（柜台2）怎么走
        /*
        请求转发必须要以斜杠打头， / 斜杠表示地址为：http://ip:port/工程名/ ,映射到IDEA代码的web目录
         */
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/form.html");
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/www.baidu.com");

        // 走向Sevlet2（柜台2）
        requestDispatcher.forward(req,resp);
    }
}
