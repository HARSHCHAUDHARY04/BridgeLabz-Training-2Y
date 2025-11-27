package org.example.model;

public class Result {
    private int resultId;
    private int studentId;
    private int marks;
    private String grade;

    public Result() {}

    public Result(int resultId, int studentId, int marks, String grade) {
        this.resultId = resultId;
        this.studentId = studentId;
        this.marks = marks;
        this.grade = grade;
    }

    public int getResultId() { return resultId; }
    public void setResultId(int resultId) { this.resultId = resultId; }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}
