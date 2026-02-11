import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = input.nextLine();
        String[] digits = new String[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = String.valueOf(number.charAt(i));
        }
        System.out.print("Reversed number: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}