package com.maoyan.service.impl;

import com.maoyan.Dao.LoginDao;
import com.maoyan.Dao.impl.LoginDaoimpl;
import com.maoyan.pojo.User;
import com.maoyan.service.LoginService;

public class LoginServiceimpl implements LoginService {
    @Override
    public User checkLoginService(String uname, String pwd) {
        LoginDao loginDao = new LoginDaoimpl();
        User u = loginDao.checkLoginDao(uname,pwd);
        return u;
    }

    @Override
    public User checkLoginService(String uid) {
        LoginDao loginDao = new LoginDaoimpl();
        User u = loginDao.checkLoginDao(uid);
        return u;
    }
}
