package servlet0;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author YANG
 * @create 2021-07-13 21:20
 */
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1、获取 web.xml 中配置的上下文参数 context-param
        ServletContext servletContext = getServletContext();
        String username = servletContext.getInitParameter("username");
        System.out.println("username的值为：" + username);
//        2、获取当前的工程路径，格式: /工程路径
        System.out.println("获取当前工程路径：" + servletContext.getContextPath());
//        3、获取工程部署后在服务器硬盘上的绝对路径
        /*
        / 表示被服务器解析地址为： http://ip:port/工程名/  映射到IDEA代码的web目录
         */
        System.out.println("工程部署后在服务器硬盘上的绝对路径：" + servletContext.getRealPath("/"));
        System.out.println("web下的css文件：" + servletContext.getRealPath("/css"));
    }
}
