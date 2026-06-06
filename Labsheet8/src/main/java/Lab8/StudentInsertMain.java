package Lab8;

public class StudentInsertMain {
    public static void main(String[] args) {
        
        Student student = new Student(1, "Nimal", 85);

        StudentDAO studentDao = new StudentDAO();

        studentDao.addStudent(student);
    }
}
