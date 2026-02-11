import java.util.Scanner;

class java1 {
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0; // cm → m
            double bmi = weight / (height * height);
            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getBMIStatus(bmi);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] result = computeBMI(persons);
        System.out.println("Weight  Height  BMI   Status");
        for (String[] row : result) {
            System.out.println(row[0] + "   " + row[1] + "   " + row[2] + "   " + row[3]);
        }

        sc.close();
    }
}
