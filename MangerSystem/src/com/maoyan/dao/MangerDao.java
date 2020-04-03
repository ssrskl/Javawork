package com.maoyan.dao;
import	java.util.List;

import com.maoyan.pojo.User;

/**
 * @author Maoyan
 * @date 2020/3/24 9:55
 */
public interface MangerDao {
    /**
     * 使用用户名和密码查询
     * @param uname 用户名
     * @param pwd 密码
     * @return User对象
     */
    User checkMangerLoginDao(String uname,String pwd);

    /**
     * 根据uid修改密码
     * @param newPwd
     * @param uid
     * @return
     */
    int userChangepwdDao(String newPwd,int uid);

    /**
     * 获取用户信息
     * @return
     */
    List<User> userShowDao();

    /**
     * 用户注册
     * @param user
     * @return
     */
    int userRegDao(User user);
}
