import java.util.Scanner;

public class SumOfNNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number (n > 0): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
        } else {
            
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);

            if (sum == formulaSum) {
                System.out.println("Both computations are correct and match.");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }
        input.close();
    }
}