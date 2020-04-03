<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/3/22
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<html>
<head>
    <title>Title</title>
</head>
<body>
<b>我是一个可爱的转发页面</b>
<b>我的名字是:</b>
<%=request.getParameter("name")%>
<a href="includeStastic.jsp">静态</a>
</body>
</html>
