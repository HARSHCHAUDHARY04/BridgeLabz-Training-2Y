import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] digit = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            digit[i] = input.nextInt();
        }
        int a = digit[0];
        
        for (int i = 0; i < 10; i++) {
            if (digit[i] > a) {
                a = digit[i];
            }
        }
        int b = digit[0];
        for (int i = 0; i < 10; i++) {
            if (digit[i] > b && digit[i] < a) {
                b = digit[i];
            }
        }
        System.out.println("Largest digit: " + a);
        System.out.println("Second largest digit: " + b);
    }
}