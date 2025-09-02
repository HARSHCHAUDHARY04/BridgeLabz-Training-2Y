import java.util.Scanner;

class PersonCanVote {
   public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);

      System.out.println("Enter your age: ");
      int n = input.nextInt();

      if (n >=18) {
         System.out.println("The person can vote.");
      } else {
         System.out.println("The person cannot vote.");
      }

      input.close();
   }
}