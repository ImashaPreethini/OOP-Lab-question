package Lab8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    
    public void addStudent(Student student) {
        
        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";
        
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
           
            pstmt.setInt(1, student.getStudentId());
            pstmt.setString(2, student.getStudentName());
            pstmt.setInt(3, student.getMark());
         
            pstmt.executeUpdate();

            System.out.println("Student added successfully.");
            
        } catch (SQLException e) {
            System.out.println("Error while adding student to the database!");
            e.printStackTrace();
        }
    }
}
