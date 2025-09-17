public class Student {
    private static String universityName = "National University";
    private static int totalStudents = 0;
    private final String rollNumber;
    private String name;
    private double grade;

    public Student(String rollNumber, String name, double grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid object type");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("R101", "Alice", 8.5);
        Student student2 = new Student("R102", "Bob", 7.8);
        student1.displayDetails(student1);
        displayTotalStudents();
    }
}
