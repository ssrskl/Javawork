package com.maoyan.servlet;

import com.maoyan.pojo.User;
import com.maoyan.service.LoginService;
import com.maoyan.service.impl.LoginServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("UTF-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");

        //获取数据
        String uname = req.getParameter("username");
        String pwd = req.getParameter("password");
        System.out.println(uname+pwd);

        LoginService loginService = new LoginServiceimpl();
        User u = loginService.checkLoginService(uname,pwd);
        if (u!=null) {
            System.out.println("uid: "+u.getUid());
            System.out.println("uname: "+u.getUname());
            System.out.println("pwd: "+u.getPwd());
            System.out.println("登录成功");
            //创建三天免登录
            Cookie cookie = new Cookie("uid",u.getUid()+"");
            //设置有效期
            cookie.setMaxAge(3*24*3600);
            //设置路径
            cookie.setPath("cookie");
            //添加cookie信息
            resp.addCookie(cookie);
            resp.sendRedirect("Mainhtml.html");
        }else {
            System.out.println("登录失败");
        }
//        Enumeration enumeration = req.getHeaderNames();
//        while (enumeration.hasMoreElements()){
//            //获取键
//            String name = (String) enumeration.nextElement();
//            //获取值
//            String value = req.getHeader(name);
//            System.out.println(name+": "+value);
//        }
    }
}
