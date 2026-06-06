package Lab8;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {
    public static void main(String[] args) {
        try {
            Connection conn = StudentDatabaseConnection.getConnection();
            
            if (conn != null) {
                System.out.println("Database connected successfully.");
                conn.close(); 
            }
        } catch (SQLException e) {
            System.out.println("Database connection failed! Please check your server setup.");
            e.printStackTrace();
        }
    }
}
