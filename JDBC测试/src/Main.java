import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
           Connection connection = JDBCUtil.getConnection();
           String sql = "select * from t_user";
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("uname"));
            System.out.println(resultSet.getString("pwd"));
        }
        resultSet.close();
        preparedStatement.close();
           connection.close();

    }
}
