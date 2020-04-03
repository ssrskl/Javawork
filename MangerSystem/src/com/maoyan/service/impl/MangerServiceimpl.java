package com.maoyan.service.impl;

import com.maoyan.dao.MangerDao;
import com.maoyan.dao.impl.MangerDaoimpl;
import com.maoyan.pojo.User;
import com.maoyan.service.MangerService;
import org.apache.log4j.Logger;


/**
 * @author Maoyan
 * @date 2020/3/24 10:26
 */
public class MangerServiceimpl implements MangerService {
    //声明日志对象
    Logger logger = Logger.getLogger(MangerServiceimpl.class);
    //声明Dao层对象
    MangerDao mangerDao = new MangerDaoimpl();

//登录
    @Override
    public User checkMangerService(String uname, String pwd) {
        User user = mangerDao.checkMangerLoginDao(uname, pwd);

        if (user != null){
            logger.debug(uname+"登录成功");
            //System.out.println("登录成功");
        }else {
            logger.debug(uname+"登录失败");
            //System.out.println("登录失败");
        }
        return user;
    }

    @Override
    public int userChangService(String newPwd, int uid) {
        return 0;
    }

    @Override
    public int userRegService(User user) {
        int regmark = mangerDao.userRegDao(user);
        return regmark;
    }
}
