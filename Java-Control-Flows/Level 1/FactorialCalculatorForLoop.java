import java.util.Scanner;

public class FactorialCalculatorForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        scanner.close();
    }
}