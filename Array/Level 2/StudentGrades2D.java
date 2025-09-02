import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int mark;
                do {
                    System.out.print("  Enter marks in " + subject + " (0-100): ");
                    mark = sc.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("  Please enter a valid mark between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }

            // Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Calculate grade
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 80)
                grade[i] = 'B';
            else if (percentage[i] >= 70)
                grade[i] = 'C';
            else if (percentage[i] >= 60)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // Display results
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%c\n",
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}