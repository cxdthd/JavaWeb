<%--
  Created by IntelliJ IDEA.
  User: 17527
  Date: 2021/7/17
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
头部信息<br/>
主题信息<br/>
<%--
    <%@include file=""%> 就是静态包含
    file 属性指定你要包含的jsp页面的路径
    地址中的第一个斜杠 / 表示为：http://ip:port/工程路径/ 映射到代码的web目录
--%>
<%--<%@include file="/include/footer.jsp"%>--%>

<%--
    <jsp:include page=""></jsp:include>     ---动态包含
    page 属性是指你要包含的jsp页面的路径
    动态包含也可以像静态包含一样，把被包含的内容执行输出到包含位置

    动态包含的特点：
        1.动态包含会把包含的jsp页面也翻译成为java代码
        2.动态包含底层代码使用如下代码去调用被包含的jsp页面执行输出：
            JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
--%>
<%--<jsp:include page="footer.jsp">--%>
<%--    <jsp:param name="username" value="cxdthd"/>--%>
<%--</jsp:include>--%>


<jsp:forward page="/include/footer.jsp"></jsp:forward>


</body>
</html>
