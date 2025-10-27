package com.company.analytics.hr;

public class EmployeeReport {
    private String employeeName;
    private double performanceScore;
    
    public EmployeeReport(String employeeName, double performanceScore) {
        this.employeeName = employeeName;
        this.performanceScore = performanceScore;
    }
    
    public void printPerformanceData() {
        System.out.println("Employee Performance Report:");
        System.out.println("Employee: " + employeeName);
        System.out.println("Performance Score: " + performanceScore);
    }
}

