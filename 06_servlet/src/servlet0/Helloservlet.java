package servlet0;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

/**
 * @author YANG
 * @create 2021-07-12 21:39
 */
public class Helloservlet implements Servlet {

    public Helloservlet() {
        System.out.println("1、构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2、init方法");

//        1、可以获取 Servlet 程序的别名 servlet-name 的值
        System.out.println("Helloservlet程序的别名：" + servletConfig.getServletName());
//        2、获取初始化参数 init-param
        System.out.println("参数username:" + servletConfig.getInitParameter("username"));
//        3、获取 ServletContext 对象
        System.out.println(servletConfig.getServletContext());

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * service方法是专门处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3、hello servlet 被访问了！！！");
        // 因为ServletRequest没有getMethod()方法，所有使用它的子接口HttpServletRequest
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        // 获取请求的方式
        String method = httpServletRequest.getMethod();
        if ("get".equalsIgnoreCase(method)){
            doGet();
        }else if("post".equalsIgnoreCase(method)){
            doPost();
        }
    }

    /*
    做get请求的事情
     */
    private void doGet(){
        System.out.println("get请求");
    }
    /*
    做post请求的事情
     */
    private void doPost(){
        System.out.println("post请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4、destory销毁方法 ");
    }
}
