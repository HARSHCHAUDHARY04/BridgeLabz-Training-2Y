import java.util.Scanner;

class CountDown2 {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the countdown");
      int Start = input.nextInt();

      for (; Start >= 1;) {
         System.out.println(Start--);
      }
      System.out.println("Launch!!!");
      input.close();
    }
   }