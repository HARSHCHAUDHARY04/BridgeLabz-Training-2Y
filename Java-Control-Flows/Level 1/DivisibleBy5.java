import java.util.Scanner;

class DivisibleBy5 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Enter an integer value: ");
      int x = input.nextInt();
    
      int DivisibleBy5 = x%5;

      if (DivisibleBy5 == 0) {
         System.out.println("Is the number " + x + " divisible by 5? Yes");
      } else {
         System.out.println("Is the number " + x + " divisible by 5? No");
      }

      input.close();
   }
}
