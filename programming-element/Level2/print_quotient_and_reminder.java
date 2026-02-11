import java.util.Scanner;
public class print_quotient_and_reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int quotient = number1 / number2;
            int reminder = number1 % number2;
            System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two numbers " + number1 + " and " + number2);
        }
        
        sc.close();
    }
}
