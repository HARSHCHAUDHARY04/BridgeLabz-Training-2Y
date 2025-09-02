import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                System.out.println("Number " + a[i] + " is positive.");
            } else if (a[i] < 0) {
                System.out.println("Number " + a[i] + " is negative.");
            } else {
                System.out.println("Number " + a[i] + " is zero.");
            }
        }

        if (a[0] > a[4]) {
            System.out.println("Number " + a[0] + " is greater than number " + a[4]);
        } else if (a[0] == a[4]) {
            System.out.println("Number " + a[0] + " is equal to number " + a[4]);
        } else {
            System.out.println("Number " + a[0] + " is less than number " + a[4]);
        }

        input.close();
    }
}