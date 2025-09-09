import java.util.Scanner;

class java10 {
    public static String grade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 50) return "C";
        else return "D";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // phy, chem, math
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextInt();

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = Math.round((total / 3.0) * 100.0) / 100.0;
            grade[i] = grade(percentage[i]);
        }

        System.out.println("Phy  Chem  Math  %   Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + "   " + marks[i][1] + "   " + marks[i][2] +
                               "   " + percentage[i] + "   " + grade[i]);
        }

        sc.close();
    }
}
