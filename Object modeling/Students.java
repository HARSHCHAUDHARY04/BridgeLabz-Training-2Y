import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students;  

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("  Student: " + s.name);
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

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this); 
    }

    void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("  " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;  

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println(" Student: " + s.name);
        }
    }
}


public class Students {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

 
        school.addStudent(s1);
        school.addStudent(s2);


        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.showStudents();

        s1.viewCourses();
        s2.viewCourses();

        c1.showStudents();
        c2.showStudents();
    }
}
