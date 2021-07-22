<%@ page import="java.util.concurrent.BrokenBarrierException" %><%--
  Created by IntelliJ IDEA.
  User: 17527
  Date: 2021/7/17
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--练习一：在 jsp 页面中输出九九乘法口诀--%>

<%
    for (int i = 1; i < 10; i++) {
        for (int j = 1; j < i + 1; j++) {
%>
<%=j + "x" + i + "=" + i * j %>
<%
    }
%>
<br>
<%
    }
%>
</body>
</html>
