package servlet0;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author YANG
 * @create 2021-07-15 12:28
 */
public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游：Response1");

        // 设置响应状态码302，表示重定向。（已搬迁）
        resp.setStatus(302);
        // 设置响应头，说明新的地址在哪里
        resp.setHeader("Location","http://localhost:8080/07_servlet/response02");
    }
}
