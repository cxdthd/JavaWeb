package servlet0;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author YANG
 * @create 2021-07-14 14:50
 */
public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        i. getRequestURI() 获取请求的资源路径
        System.out.println("URI ==>" + req.getRequestURI());
//        ii. getRequestURL() 获取请求的统一资源定位符（绝对路径）
        System.out.println("绝对路径：" + req.getRequestURL());
        /*
        在IDEA中，使用localhost访问时，得到的客户端ip地址是：0:0:0:0:0:0:0:1
        在IDEA中，使用127.0.0.1访问时，得到的客户端ip地址是：127.0.0.1
        在IDEA中，使用192.168.43.35访问时，得到的客户端ip地址是：192.168.43.36
         */
//        iii. getRemoteHost() 获取客户端的 ip 地址
        System.out.println("客户端 IP地址为：" + req.getRemoteHost());
//        iv. getHeader() 获取请求头
        System.out.println("请求头User-Agent:" + req.getHeader("User-Agent"));
//        vii. getMethod() 获取请求的方式 GET 或 POST
        System.out.println("请求的参数：" + req.getMethod());



    }
}
