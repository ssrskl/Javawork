package com.maoyan.service;

import com.maoyan.pojo.User;
//业务层接口
public interface LoginService {
    //使用账号密码
    User checkLoginService(String uname,String pwd);
    //使用id
    User checkLoginService(String uid);
}
