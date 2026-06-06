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
    
    public void displayAllStudents() {
        String sql = "SELECT student_id, student_name, mark FROM students";
        
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
            
             java.sql.ResultSet rs = pstmt.executeQuery()) {
            
            System.out.println("--- Student Records ---");
           
            while (rs.next()) {
                int id = rs.getInt("student_id");
                String name = rs.getString("student_name");
                int mark = rs.getInt("mark");
             
                System.out.println("ID: " + id + " | Name: " + name + " | Mark: " + mark);
            }
            System.out.println("-----------------------");
            
        } catch (SQLException e) {
            System.out.println("Error while fetching students from the database!");
            e.printStackTrace();
        }
    }
    
    public void findStudentById(int studentId) {
        String sql = "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";
        
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, studentId);
            
            try (java.sql.ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("student_id");
                    String name = rs.getString("student_name");
                    int mark = rs.getInt("mark");
                    System.out.println("Found -> ID: " + id + " | Name: " + name + " | Mark: " + mark);
                } else {
                    System.out.println("Student not found.");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Error while searching student!");
            e.printStackTrace();
        }
    }

    public void updateStudentMark(int studentId, int newMark) {
        String sql = "UPDATE students SET mark = ? WHERE student_id = ?";
        
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, newMark);
            pstmt.setInt(2, studentId);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Student mark updated successfully.");
            } else {
                System.out.println("Student not found. Mark not updated.");
            }
            
        } catch (SQLException e) {
            System.out.println("Error while updating student mark!");
            e.printStackTrace();
        }
    }
}

