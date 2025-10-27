package college.faculty;

public class Faculty {
    private String name;
    private String subject;
    
    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

