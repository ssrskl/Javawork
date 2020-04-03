package com.maoyan.servlet;

import com.maoyan.pojo.User;
import com.maoyan.service.MangerService;
import com.maoyan.service.impl.MangerServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Maoyan
 * @date 2020/3/24 10:33
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {

    //创建Service层对象
    MangerService mangerService = new MangerServiceimpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        String oper = req.getParameter("oper");
        if ("login".equals(oper)){
            //调用登录方法
            checkLoginWeb(req,resp);
        }
        if ("reg".equals(oper)){
            //注册方法
            userReg(req,resp);
        }
    }

    /**
     * 登录功能
     * @param req
     * @param resp
     * @throws IOException
     * @throws ServletException
     */
    private void checkLoginWeb(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
//        MangerService mangerService = new MangerServiceimpl();
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        User user = mangerService.checkMangerService(uname,pwd);

        //判断登录是否成功
        if (user != null){
            //登录成功
            //获取Session
            HttpSession httpSession = req.getSession();
            //将数据存入Session中
            httpSession.setAttribute("user",user);
            //重定向
            resp.sendRedirect("/main/main.jsp");
        }else {
            //登录失败
            //将标识符加入到request中
            req.setAttribute("loginflag",0);
            //请求转发
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }
    }

    private void userReg(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
        User user = null;
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        String sex = req.getParameter("sex");
        int age=req.getParameter("age")!=""?Integer.parseInt(req.getParameter("age")):0;
        String birth = req.getParameter("birth");

//        String[] births = null;
//        if (birth != ""){
//            births = birth.split("/");
//            birth = births[2] + "-" + births[0] + "-" + births[1];
//        }
        System.out.println(uname+":"+pwd+":"+sex+":"+age+":"+birth);
        user = new User(0,uname,pwd,sex,age,birth);

        //调用注册方法
        int index = mangerService.userRegService(user);

        //判断注册结果
        if (index>0){
            //注册成功
            //将标识符加入到request中
            req.setAttribute("regflag",0);
            //请求转发
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }else {
            //注册失败
            resp.getWriter().write("注册失败");
            return;
        }
    }
}
