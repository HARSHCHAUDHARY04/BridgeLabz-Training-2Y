# Student Result Management System

A console-based Java application demonstrating JDBC CRUD operations using MySQL.

## Setup

1. Ensure MySQL is running.
2. Create database and tables by running `student_db.sql` (in MySQL CLI or Workbench).
3. Update DB credentials in `JDBCUtil.java` if needed (currently root/mysql).
4. Build with Maven: `mvn clean package`
5. Run with IDE or: `mvn exec:java -Dexec.mainClass="org.example.Main"`

