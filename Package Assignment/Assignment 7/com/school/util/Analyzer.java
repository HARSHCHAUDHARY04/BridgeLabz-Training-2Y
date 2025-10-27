package com.school.util;

import com.school.data.Student;

public class Analyzer {
    public double calculateAverage(Student s) {
        double sum = s.getSubject1() + s.getSubject2() + s.getSubject3();
        return sum / 3.0;
    }
    
    public String findGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }
}

