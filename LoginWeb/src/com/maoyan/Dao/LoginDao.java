package com.maoyan.Dao;

import com.maoyan.pojo.User;

public interface LoginDao {
    //Dao层接口
    User checkLoginDao(String uname,String pwd);

    User checkLoginDao(String uid);
}
