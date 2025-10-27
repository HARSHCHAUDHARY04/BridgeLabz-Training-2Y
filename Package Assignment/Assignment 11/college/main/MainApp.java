package college.main;

import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;

public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student("Ankit", "CS101");
        Student s2 = new Student("Divya", "CS102");
        
        Faculty f1 = new Faculty("Dr. Verma", "Mathematics");
        Faculty f2 = new Faculty("Dr. Singh", "Physics");
        
        Department d1 = new Department("Computer Science", "CS");
        Department d2 = new Department("Electronics", "ECE");
        
        System.out.println("=== College Information ===");
        System.out.println();
        
        s1.displayStudent();
        s2.displayStudent();
        System.out.println();
        
        f1.displayFaculty();
        f2.displayFaculty();
        System.out.println();
        
        d1.displayDepartment();
        d2.displayDepartment();
    }
}

