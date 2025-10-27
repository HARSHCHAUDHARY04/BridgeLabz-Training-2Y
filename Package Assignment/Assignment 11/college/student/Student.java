package college.student;

public class Student {
    private String name;
    private String studentId;
    
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    public void displayStudent() {
        System.out.println("Student: " + name + " [ID: " + studentId + "]");
    }
}

