package org.example.model;

public class Student {
    private int studentId;
    private String name;
    private String course;
    private String email;
    private String phone;

    public Student() {}

    public Student(int studentId, String name, String course, String email, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.email = email;
        this.phone = phone;
    }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
