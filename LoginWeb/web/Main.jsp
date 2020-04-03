<%@ page import="com.maoyan.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/3/20
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<%
    HttpSession httpSession = request.getSession();
    String name= (String) httpSession.getAttribute("name");
%>
欢迎登录成功
</body>
</html>
