package jdbc01;

import java.sql.*;

public class JdbcTest01 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb", "root", "MKs@123#");
            System.out.println("done");
            Statement statement= conn.createStatement();
            String query= "select * from student";
            ResultSet resultSet= statement.executeQuery(query);
            while(resultSet.next()) {
                int id= resultSet.getInt("student_id");
                System.out.println(id);
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
