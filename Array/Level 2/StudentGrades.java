import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        // 2D array: rows = students, columns = subjects (0: Physics, 1: Chemistry, 2: Maths)
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        String[] subjects = {"Physics", "Chemistry", "Maths"};

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    System.out.print("  " + subjects[j] + " (0-100): ");
                    mark = scanner.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("    Invalid! Enter a value between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentages[i] = total / 3.0;

            if (percentages[i] >= 90) grades[i] = 'A';
            else if (percentages[i] >= 80) grades[i] = 'B';
            else if (percentages[i] >= 70) grades[i] = 'C';
            else if (percentages[i] >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }

        // Output results
        System.out.println("\nStudent  Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%6d  %7d  %9d  %5d    %9.2f    %c\n",
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}