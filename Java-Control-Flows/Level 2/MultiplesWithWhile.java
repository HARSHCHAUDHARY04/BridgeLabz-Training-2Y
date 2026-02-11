import java.util.Scanner;

public class MultiplesWithWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Multiples of " + number + " are:");
            int i = 100;
            while (i >= 1) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i--;
            }
        }

        sc.close();
    }
}
