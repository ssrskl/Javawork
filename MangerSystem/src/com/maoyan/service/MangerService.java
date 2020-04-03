package com.maoyan.service;

import com.maoyan.pojo.User;

/**
 * @author Maoyan
 * @date 2020/3/24 10:24
 */
public interface MangerService {
    User checkMangerService(String uname,String pwd);

    int userChangService(String newPwd,int uid);



    int userRegService(User user);
}
