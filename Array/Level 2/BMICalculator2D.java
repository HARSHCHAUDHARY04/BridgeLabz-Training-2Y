import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [][0]=height, [][1]=weight, [][2]=BMI
        String[] weightStatus = new String[number];

        // Input and validation
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // Height input
            double height;
            do {
                System.out.print("  Enter height in meters (positive value): ");
                height = sc.nextDouble();
                if (height <= 0) System.out.println("  Height must be positive.");
            } while (height <= 0);

            // Weight input
            double weight;
            do {
                System.out.print("  Enter weight in kg (positive value): ");
                weight = sc.nextDouble();
                if (weight <= 0) System.out.println("  Weight must be positive.");
            } while (weight <= 0);

            // Store height and weight
            personData[i][0] = height;
            personData[i][1] = weight;

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal weight";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display results
        System.out.println("\nPerson\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}