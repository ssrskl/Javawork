package com.maoyan.Cookie;

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
        /**
         * Cookie学习:
         * 		作用:解决了发送的不同请求的数据共享问题
         * 		使用:
         * 			Cookie的创建和存储
         * 				//创建Cookie对象
         * 					Cookie c=new Cookie(String name, String value);
         * 				//设置cookie(可选)
         * 					//设置有效期
         * 					c.setMaxAge(int seconds);
         *					//设置有效路径
         *					c.setPath(String uri)
         *				//响应Cookie信息给客户端
         *					resp.addCookie(c);
         *			Cookie的获取
         *				//获取Cookie信息数组
         *				Cookie[] cks=req.getCookies();
         *				//遍历数组获取Cookie信息
         *					使用for循环遍历即可，示例：
         if(cks!=null){
         for(Cookie c:cks){
         String name=c.getName();
         String value=c.getValue();
         System.out.println(name+":"+value);
         }
         }
         *		注意:
         *			一个Cookie对象存储一条数据。多条数据，可以多创建几个Cookie对象进行存储。
         *		特点:
         *			浏览器端的数据存储技术。
         *			存储的数据声明在服务器端。
         *			临时存储:存储在浏览器的运行内存中，浏览器关闭即失效。
         *			定时存储:设置了Cookie的有效期，存储在客户端的硬盘中，在有效期内符合路径要求的请求都会附带该信息。
         *			默认cookie信息存储好之后，每次请求都会附带，除非设置有效路径
         * @author MyPC
         *
         */

        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        Cookie cookie = new Cookie("key","maoyan");
        cookie.setMaxAge(3*24*3600);

    }
}
