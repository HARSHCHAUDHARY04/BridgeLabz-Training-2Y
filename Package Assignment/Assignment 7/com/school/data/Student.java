package com.school.data;

public class Student {
    private String name;
    private int subject1;
    private int subject2;
    private int subject3;
    
    public Student(String name, int subject1, int subject2, int subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSubject1() {
        return subject1;
    }
    
    public int getSubject2() {
        return subject2;
    }
    
    public int getSubject3() {
        return subject3;
    }
    
    @Override
    public String toString() {
        return "Student: " + name + ", Marks - Sub1: " + subject1 + ", Sub2: " + subject2 + ", Sub3: " + subject3;
    }
}

