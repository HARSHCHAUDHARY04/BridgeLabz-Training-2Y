package com.company.main;

import com.company.hr.Employee;
import com.company.payroll.Payroll;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1001);
        emp.setName("Priya");
        emp.setDepartment("IT");
        emp.setSalary(50000);
        
        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Original Salary: " + emp.getSalary());
        
        Payroll payroll = new Payroll();
        double salaryWithBonus = payroll.calculateBonus(emp);
        System.out.println("Salary after 10% Bonus: " + salaryWithBonus);
    }
}

