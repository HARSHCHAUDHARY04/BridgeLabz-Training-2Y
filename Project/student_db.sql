-- Create database and tables for Student Result Management System
CREATE DATABASE IF NOT EXISTS student_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE student_db;

-- Students table
CREATE TABLE IF NOT EXISTS students (
  studentId INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  course VARCHAR(100) NOT NULL,
  email VARCHAR(150),
  phone VARCHAR(20),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Results table
CREATE TABLE IF NOT EXISTS results (
  resultId INT AUTO_INCREMENT PRIMARY KEY,
  studentId INT NOT NULL,
  marks INT NOT NULL CHECK (marks BETWEEN 0 AND 100),
  grade VARCHAR(3) NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (studentId) REFERENCES students(studentId) ON DELETE RESTRICT ON UPDATE CASCADE
);

-- Sample data
INSERT INTO students (name, course, email, phone) VALUES
('Raj Kumar','BSc Computer Science','raj@example.com','9876543210'),
('Anita Sharma','BSc Computer Science','anita@example.com','9876500011');

INSERT INTO results (studentId, marks, grade) VALUES (1, 82, 'A'), (2, 67, 'C');
