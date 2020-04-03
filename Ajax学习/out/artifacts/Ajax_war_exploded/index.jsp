<%--
  Created by IntelliJ IDEA.
  User: HASEE
  Date: 2020/3/25
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="text/javascript">
  function getData() {
      //创建Ajax对象
      var ajax;
      //创建XMLHttpRequest对象
      if (window.XMLHttpRequest){//火狐浏览器
          //主流浏览器都支持XMLHttpRequest()
          ajax = new XMLHttpRequest();
      }else if (window.ActiveXObject){//IE浏览器
          //老版本的IE浏览器
          ajax = ActiveXObject();
      }
      //复写onreadystatement函数
      ajax.onreadystatechange = function () {
          if (ajax.readyState == 4) {
              //判断响应状态码
              var statusmark = ajax.status;
              if (statusmark == 200){
                  //获取响应的内容
                  var result = ajax.responseText;
                  alert(result);
                  //获取元素
                  var showdiv = document.getElementById("showdiv");
                  showdiv.innerHTML = result;
              }else if(statusmark == 404){
                  var showdiv = document.getElementById("showdiv");
                  showdiv.innerHTML = "404";
              }else if (statusmark == 500){
                  var showdiv = document.getElementById("showdiv");
                  showdiv.innerHTML = "服务器错误";
              }else{
                  var showdiv = document.getElementById("showdiv");
                  showdiv.innerHTML = "错误";
              }

          }
      }
      //发送请求
      ajax.open("get","/MainPage",false);
      //false设置Ajax为同步
      //open方法后的ajax是一个servlet
      ajax.send(null);
      //测试Ajax同步
      alert("测试Ajax同步")
  }
</script>
<style type="text/css">
  #showdiv{
    border:solid 1px;
    width:200px;
    height:100px;
  }
</style>
  <head>
    <title>欢迎学习Ajax</title>
  </head>
  <body>
  <h3>欢迎学习Ajax</h3>
  <hr>
  <input type="button" value="按钮" onclick="getData()">
  <div id="showdiv"></div>
  </body>
</html>
