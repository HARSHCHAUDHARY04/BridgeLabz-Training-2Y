import java.util.Scanner;

class SmallestOfThreeNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


      System.out.println("Enter first integer value: ");
      int x = input.nextInt();
      System.out.println("Enter second integer value: ");
      int y = input.nextInt();
      System.out.println("Enter third integer value: ");
      int z = input.nextInt();

      int smallest = x;

      if (y < smallest) {
         smallest = y;
      }
      if (z < smallest) {
         smallest = z;
      }

      System.out.println("The smallest of the three numbers is: " + smallest);
      }

   }