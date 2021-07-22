package servlet0;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author YANG
 * @create 2021-07-14 15:56
 */
public class ParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        // 获取请求参数
        System.out.println("参数username:" + req.getParameter("username"));
        System.out.println("参数password:" + req.getParameter("password"));
        String str = "";
        String[] hobbies = req.getParameterValues("hobby");
        for (String hob : hobbies
        ) {
            str += "【" + hob + "】";
        }
        System.out.println("兴趣爱好:" + str);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("-------doPost---------");
        // 获取请求参数
        System.out.println("参数username:" + req.getParameter("username"));
        System.out.println("参数password:" + req.getParameter("password"));
        String str = "";
        String[] hobbies = req.getParameterValues("hobby");
        for (String hob : hobbies
        ) {
            str += "【" + hob + "】";
        }
        System.out.println("兴趣爱好:" + str);

    }
}
