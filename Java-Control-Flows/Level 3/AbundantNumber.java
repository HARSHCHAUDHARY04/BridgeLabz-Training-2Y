import java.util.Scanner;

public class AbundantNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int sum = 0;

   for (int i = 1; i < a; i++) {
       if (a % i == 0) {
           sum += i;
       }
   }

    if (sum > a)
        System.out.println(a + " is an Abundant number.");
    else
        System.out.println(a + " is not an Abundant number.");

    sc.close();
    }
}