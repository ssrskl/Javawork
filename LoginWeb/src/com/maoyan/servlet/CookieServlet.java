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

@WebServlet(name = "CookieServlet")
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取Cookie信息
        Cookie[] cookies = req.getCookies();
        //处理cookie信息
        if (cookies!=null){
            //遍历cookie
            String uid = "";
            for (Cookie c:cookies) {
                if (uid.equals(c.getName())){
                    uid = c.getValue();
                }
            }
            //检验cookie是否存在
            if ("".equals(uid)){
                //请求转发
                req.getRequestDispatcher("/login").forward(req,resp);
                return;
            }else {
                //校验UID用户信息
                //获取业务层对象
                LoginService ls=new LoginServiceimpl();
                User u=ls.checkLoginService(uid);
                if(u!=null){
                    //重定向
                    resp.sendRedirect("Mainhtml.html");
                    return;
                }else{
                    //请求转发
                    req.getRequestDispatcher("login").forward(req, resp);
                    return;
                }
            }
        }else {
            //请求转发
            req.getRequestDispatcher("login").forward(req, resp);
            return;
        }
    }
}
