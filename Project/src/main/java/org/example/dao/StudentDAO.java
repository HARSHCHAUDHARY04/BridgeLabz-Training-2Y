package org.example.dao;

import org.example.model.Student;
import java.util.List;

public interface StudentDAO {
    int addStudent(Student s) throws Exception;
    boolean updateStudent(Student s) throws Exception;
    Student getStudentById(int studentId) throws Exception;
    List<Student> getAllStudents() throws Exception;
    boolean deleteStudent(int studentId) throws Exception;
}
