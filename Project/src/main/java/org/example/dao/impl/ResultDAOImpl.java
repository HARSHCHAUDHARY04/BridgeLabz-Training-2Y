package org.example.dao.impl;

import org.example.dao.ResultDAO;
import org.example.model.Result;
import org.example.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResultDAOImpl implements ResultDAO {

    private String calculateGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        return "F";
    }

    @Override
    public int addResult(Result r) throws Exception {
        String grade = calculateGrade(r.getMarks());
        r.setGrade(grade);

        String sql = "INSERT INTO results (studentId, marks, grade) VALUES (?, ?, ?)";
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, r.getStudentId());
            ps.setInt(2, r.getMarks());
            ps.setString(3, r.getGrade());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) return rs.getInt(1);
            }
        }
        return -1;
    }

    @Override
    public boolean updateResult(Result r) throws Exception {
        String grade = calculateGrade(r.getMarks());
        r.setGrade(grade);

        String sql = "UPDATE results SET marks=?, grade=? WHERE studentId=?";
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, r.getMarks());
            ps.setString(2, r.getGrade());
            ps.setInt(3, r.getStudentId());

            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public Result getResultByStudentId(int studentId) throws Exception {
        String sql = "SELECT * FROM results WHERE studentId=?";
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Result(
                            rs.getInt("resultId"),
                            rs.getInt("studentId"),
                            rs.getInt("marks"),
                            rs.getString("grade")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<Result> getAllResults() throws Exception {
        String sql = "SELECT * FROM results ORDER BY resultId";
        List<Result> list = new ArrayList<>();
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Result(
                        rs.getInt("resultId"),
                        rs.getInt("studentId"),
                        rs.getInt("marks"),
                        rs.getString("grade")
                ));
            }
        }
        return list;
    }

    @Override
    public boolean deleteResultByStudentId(int studentId) throws Exception {
        String sql = "DELETE FROM results WHERE studentId=?";
        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            return ps.executeUpdate() > 0;
        }
    }
}
