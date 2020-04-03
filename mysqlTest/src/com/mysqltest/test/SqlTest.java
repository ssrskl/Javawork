package com.mysqltest.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlTest {
	public static void main(String[] args) throws SQLException {
		//��װ�ɹ������������
		Connection connection = JDBCUtil.getConnection();
		//����Ϊ�ֶ��ύ
		connection.setAutoCommit(false);
		//����sql���
		String sql = "insert into Persons values(?,?,?,?,?)";
		//��������
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		//��������
		//preparedStatement.setString(0, "hello");
		preparedStatement.setInt(1, 18);
		preparedStatement.setString(2, "hello");
		preparedStatement.setString(3, "hello");
		preparedStatement.setString(4, "hello");
		try {
			//�ύ����
			int i = preparedStatement.executeUpdate();
			connection.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//���ݻع�
			connection.rollback();
			e.printStackTrace();
		} finally {
			//�ر���Դ
			connection.close();
			preparedStatement.close();
		}
	}
}
