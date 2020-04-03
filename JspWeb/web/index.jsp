<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/3/21
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h2>Jsp学习!!!www</h2>
  <hr/>
  <%--
  局部代码
  --%>
  <%
  String string = "Jsp逻辑判断很难受";
  int a = 3;
  if (a<4){
  %>

  <h3>a<4哦！！！</h3>

  <%
    }else {
  %>

  <h3>a不小于4哦！！！</h3>

  <%
    }
  %>
<%--脚本语句段--%>
  <%=string2%>

  <%!
  //全局代码块，无所谓放置的位置
    String string2 = "这个是全局代码块";
  %>

  <!--
  静态引入
  -->
  <%@include file="includeStastic.jsp"%>

<!--动态引入-->
  <jsp:include page="includeActive.jsp"/>
  <!--forward转发-->
  <jsp:forward page="ForwardTest.jsp">
    <jsp:param name="name" value="Maoyan"/>
  </jsp:forward>
  </body>
</html>
