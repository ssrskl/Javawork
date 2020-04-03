package com.mysqltest.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException {
//		SQLTool sqlTool = new SQLTool("", "", "", "");
//		sqlTool.insert("小", "jj");
		JDBCUtil.getConnection();
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String UserName = "scott";
			String password = "bjsxt";
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			//连接指定的数据库
			connection = DriverManager.getConnection(url, UserName, password);
			//创建sql命令
			String sqlString  = "insert into Persons values(?,?,?)";
			//获取sql命令对象(此对象编译和发送给数据库)
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			//statement = connection.createStatement();
			//preparedStatement.setString(parameterIndex, x);
			
			int i = statement.executeUpdate(sqlString);
			if (i==(-1)) {
				System.out.println("sql语句未执行成功");
			}else {
				System.out.println("success");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//释放资源
			connection.close();
			statement.close();
		}

		
	}
}
