package com.mysqltest.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLTool {

	private String qudongString;
	private String username;
	private String password;
	private String url;
	Connection connection = null;
	Statement statement = null;
	public SQLTool(String qudString,String user,String pass,String url2) {
		this.qudongString=qudString;
		this.username=user;
		this.password=pass;
		this.url=url2;
		
//		//��������
//		Class.forName(qudString);
//		//�������ݿ�
//		connection = DriverManager.getConnection(url2, user, pass);
//		//��ȡsql�������
//		statement = connection.createStatement();
//		// TODO Auto-generated constructor stub
	}
	public void insert(String table,String values) throws SQLException {
		String sqlString = "insert into "+table+" values("+values+")";
		System.out.println(sqlString);
		int i = statement.executeUpdate(sqlString);
		if (i==(-1)) {
			System.out.println("sql���δִ�гɹ�");
		}else {
			System.out.println("success");
		}
	}
}
