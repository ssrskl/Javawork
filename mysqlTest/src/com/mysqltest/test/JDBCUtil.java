package com.mysqltest.test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	private static String driver;
	private static String url;
	private static String usernmae;
	private static String password;
	static {
		String dbproperties = "/db.properties";
		//��ȡ�����ļ�������
		Properties properties = new Properties();
		//��ȡ�����ļ���������
		InputStream inputStream = JDBCUtil.class.getResourceAsStream(dbproperties);
		try {
			//���������ļ�
			properties.load(inputStream);
			//��ȡ����
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			usernmae = properties.getProperty("usename");
			password = properties.getProperty("password");
			//��������
			Class.forName(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, usernmae, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
}
