package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Rohan", 85, 90, 78);
        System.out.println(s);
        
        Analyzer analyzer = new Analyzer();
        double avg = analyzer.calculateAverage(s);
        String grade = analyzer.findGrade(avg);
        
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}

