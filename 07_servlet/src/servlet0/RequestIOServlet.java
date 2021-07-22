package servlet0;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author YANG
 * @create 2021-07-15 9:52
 */
public class RequestIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取服务器使用的字符集
        System.out.println(resp.getCharacterEncoding()); //UTF-8

        // 方法一：分别设置服务器和客户端的字符集（不推荐）
        // 设置服务器的字符集
//        resp.setCharacterEncoding("UTF-8");
        // 通过响应头，设置浏览器也使用UTF-8字符集
        resp.setHeader("Content-Type","text/html; charset=UTF-8");

        // 方法二（推荐）
        // 它会同时设置服务器和客户端都使用UTF-8字符集，还设置了相应头
        // 此方法一定要在获取流对象之前调用才有效
        resp.setContentType("text/html; charset=UTF-8");

        // 要求： 往客户端回传字符串数据
        PrintWriter writer = resp.getWriter();
        writer.write("爱你3000遍");

    }
}
