package com.mysqltest.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlTest {
	public static void main(String[] args) throws SQLException {
		//封装成工具类加载驱动
		Connection connection = JDBCUtil.getConnection();
		//设置为手动提交
		connection.setAutoCommit(false);
		//创建sql语句
		String sql = "insert into Persons values(?,?,?,?,?)";
		//创建对象
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		//传入数据
		//preparedStatement.setString(0, "hello");
		preparedStatement.setInt(1, 18);
		preparedStatement.setString(2, "hello");
		preparedStatement.setString(3, "hello");
		preparedStatement.setString(4, "hello");
		try {
			//提交数据
			int i = preparedStatement.executeUpdate();
			connection.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//数据回滚
			connection.rollback();
			e.printStackTrace();
		} finally {
			//关闭资源
			connection.close();
			preparedStatement.close();
		}
	}
}
