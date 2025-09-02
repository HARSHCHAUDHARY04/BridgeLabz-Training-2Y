import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = sc.nextInt();

        
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = sc.nextInt();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest friend is Amar with age " + ageAmar);
        } else if (ageAkbar < ageAnthony) {
            System.out.println("Youngest friend is Akbar with age " + ageAkbar);
        } else {
            System.out.println("Youngest friend is Anthony with age " + ageAnthony);
        }

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest friend is Amar with height " + heightAmar + " cm");
        } else if (heightAkbar > heightAnthony) {
            System.out.println("Tallest friend is Akbar with height " + heightAkbar + " cm");
        } else {
            System.out.println("Tallest friend is Anthony with height " + heightAnthony + " cm");
        }

        sc.close();
    }
}
