package com.maoyan.dao.impl;
import	java.sql.ResultSet;
import	java.sql.PreparedStatement;

import com.maoyan.dao.MangerDao;
import com.maoyan.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Maoyan
 * @date 2020/3/24 10:02
 */
public class MangerDaoimpl implements MangerDao {
    @Override
    public User checkMangerLoginDao(String uname, String pwd) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User user = null;
        String sql = "select * from user_table where uname=? and pwd=?";

        connection = JDBCUtil.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,uname);
            preparedStatement.setString(2,pwd);
            resultSet = preparedStatement.executeQuery();

            //遍历结果
            while (resultSet.next()){
                //给变量赋值
                user = new User();
                user.setUid(resultSet.getInt("uid"));
                user.setUname(resultSet.getString("uname"));
                user.setPwd(resultSet.getString("pwd"));
                user.setAge(resultSet.getInt("age"));
                user.setBirth(resultSet.getString("birth"));
            }
        } catch (SQLException e) {
            System.out.println("sql对象创建失败");
            e.printStackTrace();
        }finally {
            //关闭资源
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //返回结果
        return user;
    }

    @Override
    public int userChangepwdDao(String newPwd, int uid) {
        //声明对象
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int index = -1;
        String sql = "update user_table set pwd=? where uid=?";


        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"newPwd");
            preparedStatement.setString(2,"uid");

            //执行
            index = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return index;
    }

    @Override
    public List<User> userShowDao() {
        return null;
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @Override
    public int userRegDao(User user) {
        int index = -1;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "insert into user_table values(default,?,?,?,?,?)";

        try {
            connection = JDBCUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值
            preparedStatement.setString(1,user.getUname());
            preparedStatement.setString(2,user.getPwd());
            preparedStatement.setString(3,user.getSex());
            preparedStatement.setInt(4,user.getAge());
            preparedStatement.setString(5,user.getBirth());

            //执行
            index = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return index;
    }
}
