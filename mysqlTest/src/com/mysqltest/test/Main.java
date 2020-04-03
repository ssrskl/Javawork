package com.mysqltest.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException {
//		SQLTool sqlTool = new SQLTool("", "", "", "");
//		sqlTool.insert("С", "jj");
		JDBCUtil.getConnection();
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String UserName = "scott";
			String password = "bjsxt";
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			//����ָ�������ݿ�
			connection = DriverManager.getConnection(url, UserName, password);
			//����sql����
			String sqlString  = "insert into Persons values(?,?,?)";
			//��ȡsql�������(�˶������ͷ��͸����ݿ�)
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			//statement = connection.createStatement();
			//preparedStatement.setString(parameterIndex, x);
			
			int i = statement.executeUpdate(sqlString);
			if (i==(-1)) {
				System.out.println("sql���δִ�гɹ�");
			}else {
				System.out.println("success");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//�ͷ���Դ
			connection.close();
			statement.close();
		}

		
	}
}
