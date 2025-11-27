package org.example.dao.impl;

import org.example.dao.StudentDAO;
import org.example.model.Student;
import org.example.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public int addStudent(Student s) throws Exception {
        String sql = "INSERT INTO students (name, course, email, phone) VALUES (?, ?, ?, ?)";
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getPhone());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) return rs.getInt(1);
            }
        }
        return -1;
    }

    @Override
    public boolean updateStudent(Student s) throws Exception {
        String sql = "UPDATE students SET name=?, course=?, email=?, phone=? WHERE studentId=?";
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getPhone());
            ps.setInt(5, s.getStudentId());

            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public Student getStudentById(int studentId) throws Exception {
        String sql = "SELECT * FROM students WHERE studentId=?";
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Student(
                            rs.getInt("studentId"),
                            rs.getString("name"),
                            rs.getString("course"),
                            rs.getString("email"),
                            rs.getString("phone")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() throws Exception {
        String sql = "SELECT * FROM students ORDER BY studentId";
        List<Student> list = new ArrayList<>();
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("studentId"),
                        rs.getString("name"),
                        rs.getString("course"),
                        rs.getString("email"),
                        rs.getString("phone")
                ));
            }
        }
        return list;
    }

    @Override
    public boolean deleteStudent(int studentId) throws Exception {
        String sql = "DELETE FROM students WHERE studentId=?";
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            return ps.executeUpdate() > 0;
        }
    }
}
