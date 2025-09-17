import java.util.ArrayList;

class Professor {
    String name;
    ArrayList<Course> courses;

    Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void assignCourse(Course c) {
        courses.add(c);
        c.professor = this; 
    }

    void showCourses() {
        System.out.println("Professor " + name + " teaches:");
        for (Course c : courses) {
            System.out.println("  " + c.courseName);
        }
    }
}


class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this); 
    }

    void viewCourses() {
        System.out.println("Student " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("  " + c.courseName);
        }
    }
}


class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void assignProfessor(Professor p) {
        professor = p;
        p.assignCourse(this);
    }

    void showCourseInfo() {
        System.out.println("Course: " + courseName);
        if (professor != null)
            System.out.println("  Professor: " + professor.name);
        System.out.println("  Students enrolled:");
        for (Student s : students) {
            System.out.println("    " + s.name);
        }
    }
}


public class UniversityManagement {
    public static void main(String[] args) {
       
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");

       
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

      
        Course c1 = new Course("Math");
        Course c2 = new Course("Physics");

   
        prof1.assignCourse(c1);
        prof2.assignCourse(c2);

     
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

    
        c1.showCourseInfo();
        c2.showCourseInfo();
        s1.viewCourses();
        prof1.showCourses();
    }
}
