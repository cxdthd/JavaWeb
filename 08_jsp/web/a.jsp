<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 17527
  Date: 2021/7/16
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是jsp页面

<%--声明类属性--%>
<%!
    private Integer id;
    private String name;
    private static Map<String, Object> map;
%>
<%--声明静态代码块--%>
<%!
    static {
        map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
    }
%>

<%= 12 %><br/>
<%= 12.12 %><br/>
<%= "hello,jsp" %><br/>
<%= map %>

<table border="1px" cellspacing="0">
    <%
        for (int i = 0; i < 10; i++) {
    %>
    <tr><td>第<%=i+1%>行</td></tr>

    <%
        }
    %>
</table>

</body>
</html>
