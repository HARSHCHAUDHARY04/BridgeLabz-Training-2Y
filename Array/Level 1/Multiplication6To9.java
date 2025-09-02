import java.util.Scanner;

public class Multiplication6To9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[4];
        System.out.println("Enter a number: ");
        int b = input.nextInt();
        for(int i=0; i<a.length; i++){
            a[i] = b * (i + 6);
        }

        for(int i=0; i<a.length; i++){
            System.out.println(b + " * " + (i + 6) + " = " + a[i]);
        }

    }


}