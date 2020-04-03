package com.maoyan.Dao.impl;

import com.maoyan.Dao.LoginDao;
import com.maoyan.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoimpl implements LoginDao  {
    @Override
    public User checkLoginDao(String uname, String pwd){
//        User u = new User();
//        u.setUid(1);
//        u.setUname("asdas");
//        u.setPwd("sadasdas");
        User u = null;
        ResultSet resultSet = null;
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement = null;
        String sqlcode = "select * from t_user where uname=? and pwd=?";
        if(connection==null){
            System.out.println("连接失败");
        }else {
            System.out.println("连接成功");
        }

        try {
            preparedStatement = connection.prepareStatement(sqlcode);
            preparedStatement.setString(1,uname);
            preparedStatement.setString(2,pwd);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                u = new User();
                u.setUid(resultSet.getInt("uid"));
                u.setUname(resultSet.getString("uname"));
                u.setPwd(resultSet.getString("pwd"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
           if (resultSet!=null){
               try {
                   resultSet.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }

           if (preparedStatement!=null){
               try {
                   preparedStatement.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }

           if (connection!=null){
               try {
                   connection.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }
        }





//        User u = new User();
//        u.setUid(1);
//        u.setUname("猫颜");
//        u.setPwd("123");
        return u;
    }

    @Override
    public User checkLoginDao(String uid) {
        User u = null;
        ResultSet resultSet = null;
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement preparedStatement = null;
        String sqlcode = "select * from t_user where uid=?";

        if(connection==null){
            System.out.println("连接失败");
        }else {
            System.out.println("连接成功");
        }

        try {
            preparedStatement = connection.prepareStatement(sqlcode);
            preparedStatement.setString(1,uid);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                u = new User();
                u.setUid(resultSet.getInt("uid"));
                u.setUname(resultSet.getString("uname"));
                u.setPwd(resultSet.getString("pwd"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return u;
    }
}
