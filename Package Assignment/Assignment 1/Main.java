import college.student.Student;
import college.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Ravi", 101);
        s.displayStudentDetails();
        
        Faculty f = new Faculty("Dr. Sharma", "Computer Science");
        f.displayFacultyDetails();
    }
}

