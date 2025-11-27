package org.example;

import org.example.dao.StudentDAO;
import org.example.dao.ResultDAO;
import org.example.dao.impl.StudentDAOImpl;
import org.example.dao.impl.ResultDAOImpl;
import org.example.model.Student;
import org.example.model.Result;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final StudentDAO studentDao = new StudentDAOImpl();
    private static final ResultDAO resultDao = new ResultDAOImpl();

    public static void main(String[] args) {
        System.out.println("=== Student Result Management System ===");

        while (true) {
            showMenu();
            String choice = sc.nextLine().trim();

            try {
                switch (choice) {
                    case "1": addStudent(); break;
                    case "2": updateStudent(); break;
                    case "3": listStudents(); break;
                    case "4": deleteStudent(); break;
                    case "5": addResult(); break;
                    case "6": updateResult(); break;
                    case "7": viewStudentResult(); break;
                    case "8": viewAllResults(); break;
                    case "9": deleteResult(); break;
                    case "0": System.out.println("Exiting..."); return;
                    default: System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n1) Add Student | 2) Update Student | 3) View Students | 4) Delete Student");
        System.out.println("5) Add Result  | 6) Update Result   | 7) View Student Result | 8) View All Results");
        System.out.println("9) Delete Result | 0) Exit");
        System.out.print("Choose option: ");
    }

    private static void addStudent() throws Exception {
        Student s = new Student();

        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter Course: ");
        s.setCourse(sc.nextLine());

        System.out.print("Enter Email: ");
        s.setEmail(sc.nextLine());

        System.out.print("Enter Phone: ");
        s.setPhone(sc.nextLine());

        int id = studentDao.addStudent(s);
        System.out.println("Student added successfully with ID: " + id);
    }

    private static void updateStudent() throws Exception {
        System.out.print("Enter Student ID to update: ");
        int id = Integer.parseInt(sc.nextLine());

        Student existing = studentDao.getStudentById(id);
        if (existing == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("New Name (" + existing.getName() + "): ");
        String name = sc.nextLine();
        if (!name.isEmpty()) existing.setName(name);

        System.out.print("New Course (" + existing.getCourse() + "): ");
        String course = sc.nextLine();
        if (!course.isEmpty()) existing.setCourse(course);

        System.out.print("New Email (" + existing.getEmail() + "): ");
        String email = sc.nextLine();
        if (!email.isEmpty()) existing.setEmail(email);

        System.out.print("New Phone (" + existing.getPhone() + "): ");
        String phone = sc.nextLine();
        if (!phone.isEmpty()) existing.setPhone(phone);

        boolean updated = studentDao.updateStudent(existing);
        System.out.println(updated ? "Student Updated Successfully." : "Update Failed.");
    }

    private static void listStudents() throws Exception {
        List<Student> students = studentDao.getAllStudents();
        System.out.println("\n--- Student List ---");
        System.out.println("ID | Name | Course | Email | Phone");
        for (Student s : students) {
            System.out.printf("%d | %s | %s | %s | %s%n",
                    s.getStudentId(), s.getName(), s.getCourse(), s.getEmail(), s.getPhone());
        }
    }

    private static void deleteStudent() throws Exception {
        System.out.print("Enter Student ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean deleted = studentDao.deleteStudent(id);
        System.out.println(deleted ? "Student deleted." : "Delete failed or student not found.");
    }

    private static void addResult() throws Exception {
        Result r = new Result();

        System.out.print("Enter Student ID: ");
        r.setStudentId(Integer.parseInt(sc.nextLine()));

        System.out.print("Enter Marks (0-100): ");
        r.setMarks(Integer.parseInt(sc.nextLine()));

        int id = resultDao.addResult(r);
        System.out.println("Result added successfully with Result ID: " + id);
    }

    private static void updateResult() throws Exception {
        System.out.print("Enter Student ID to update result: ");
        int id = Integer.parseInt(sc.nextLine());

        Result existing = resultDao.getResultByStudentId(id);
        if (existing == null) {
            System.out.println("Result not found for this student.");
            return;
        }

        System.out.print("New Marks (" + existing.getMarks() + "): ");
        String marksStr = sc.nextLine();
        if (!marksStr.isEmpty()) existing.setMarks(Integer.parseInt(marksStr));

        boolean updated = resultDao.updateResult(existing);
        System.out.println(updated ? "Result Updated Successfully." : "Update Failed.");
    }

    private static void viewStudentResult() throws Exception {
        System.out.print("Enter Student ID to view result: ");
        int id = Integer.parseInt(sc.nextLine());

        Result r = resultDao.getResultByStudentId(id);
        if (r == null) {
            System.out.println("No result found for this student.");
        } else {
            System.out.println("Result:");
            System.out.println("ResultID: " + r.getResultId());
            System.out.println("StudentID: " + r.getStudentId());
            System.out.println("Marks: " + r.getMarks());
            System.out.println("Grade: " + r.getGrade());
        }
    }

    private static void viewAllResults() throws Exception {
        List<Result> list = resultDao.getAllResults();
        System.out.println("\n--- Results List ---");
        System.out.println("ResultID | StudentID | Marks | Grade");
        for (Result r : list) {
            System.out.printf("%d | %d | %d | %s%n",
                    r.getResultId(), r.getStudentId(), r.getMarks(), r.getGrade());
        }
    }

    private static void deleteResult() throws Exception {
        System.out.print("Enter Student ID to delete result: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean deleted = resultDao.deleteResultByStudentId(id);
        System.out.println(deleted ? "Result deleted." : "Delete failed or result not found.");
    }
}
