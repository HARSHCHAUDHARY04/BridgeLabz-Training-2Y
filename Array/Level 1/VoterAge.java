import java.util.Scanner;

class VoterAge {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int[] a = new int[10];

      for (int i = 0; i < a.length; i++) {
         System.out.print("Enter the students age: ");
         int n = input.nextInt();
         a[i] = n;
      }

      for (int i = 0; i < a.length; i++) {

        if (a[i] >= 18) {
           System.out.println("Student with the age " + a[i] + " is eligible to vote.");
        } else {
           System.out.println("Student with the age " + a[i] + " is not eligible to vote.");
        }
      }


      input.close();
   }
}
