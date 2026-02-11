import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1; 

        if (number <= 1) {
            System.out.println("No factors available other than itself.");
        } else {
        
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;  
                }
            }

            System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }

        sc.close();
    }
}
