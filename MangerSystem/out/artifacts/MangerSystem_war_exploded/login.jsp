<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>欢迎登录后台管理系统</title>
</head>
<body>

<!--登录失败-->
<%
    Object loginobject = request.getAttribute("loginflag");
    if (loginobject != null){
%>
<div style="text-align: center">
<span style="font-size: large;color: red;font-weight: bold;">用户名密码错误</span>
</div>

<%
    }
%>

<!--注册成功-->
<%
    Object regobject = request.getAttribute("regflag");
    if (regobject != null ){
%>

<div style="text-align: center">
    <span style="font-size: large;color: red;font-weight: bold;">注册成功</span>
</div>

<%}%>
<form action="/userServlet" method="post">
    <input type="hidden" name="oper" value="login" />
    <ul>
        <li></li>
        <li><input name="uname" type="text" placeholder="用户名"   /></li>
        <li><input name="pwd" type="password" placeholder="密码"   /></li>
        <li><input name="" type="submit"  value="登录" /><label><a href="user/reg.jsp">注册</a></label><label><a href="#">忘记密码？</a></label></li>
    </ul>
</form>

</body>

</html>
