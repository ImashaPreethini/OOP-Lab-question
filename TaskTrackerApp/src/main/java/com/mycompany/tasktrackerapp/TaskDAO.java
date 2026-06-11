package com.mycompany.tasktrackerapp;

import java.sql.*;

public class TaskDAO {

   
    public boolean addTask(Task task) throws SQLException {
        String sql = "INSERT INTO tasks (task_id, task_title, status) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, task.getTaskId());
            pstmt.setString(2, task.getTaskTitle());
            pstmt.setString(3, task.getStatus());
            return pstmt.executeUpdate() > 0;
        }
    }

    public Task searchTask(int taskId) throws SQLException {
        String sql = "SELECT * FROM tasks WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, taskId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Task(
                        rs.getInt("task_id"),
                        rs.getString("task_title"),
                        rs.getString("status")
                    );
                }
            }
        }
        return null;
    }
}
