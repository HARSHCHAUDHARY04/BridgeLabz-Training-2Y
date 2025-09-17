abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayRole();

    public final boolean isEligibleForRetirement() {
        return age >= 60;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Student: " + name + ", Grade: " + grade);
    }
}

class Staff extends Person {
    private String role;

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void displayRole() {
        System.out.println("Staff: " + name + ", Role: " + role);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 45, "Math");
        Student student = new Student("Alice", 15, "Grade 10");
        Staff staff = new Staff("Mrs. Johnson", 35, "Librarian");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
