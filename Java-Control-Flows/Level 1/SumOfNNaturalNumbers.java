import java.util.Scanner;

class SumOfNNaturalNumbers {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the number of integers: ");
      int n = input.nextInt();

      if (n > 0) {
         int sum = n * (n+1) / 2;
         System.out.println("The sum of the first " + n + " integers is: " + sum);
      } else {
         System.out.println("Please enter a positive integer.");
      }

      input.close();
   }
}