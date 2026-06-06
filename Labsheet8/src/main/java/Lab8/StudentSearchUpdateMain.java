package Lab8;

public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        StudentDAO studentDao = new StudentDAO();
        
        System.out.println("--- 1. Searching for Student ID 1 ---");  
        studentDao.findStudentById(1);
        
        System.out.println("\n--- 2. Updating Student ID 1 Mark to 95 ---");
        studentDao.updateStudentMark(1, 95);
        
        System.out.println("\n--- 3. Searching for Student ID 1 Again ---");
        studentDao.findStudentById(1);
    }
}

