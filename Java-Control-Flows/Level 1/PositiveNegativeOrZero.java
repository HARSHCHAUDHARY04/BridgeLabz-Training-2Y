import java.util.Scanner;

class PositiveNegativeOrZero {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the number: ");
      int n = input.nextInt();

      if (n > 0) {
         System.out.println("Positive.");
      } if (n < 0) {
         System.out.println("Negative.");
      } else {
         System.out.println("Zero.");
      }

      input.close();
   }
}