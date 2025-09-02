import java.util.Scanner;

public class HarshadNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        String n = sc.nextLine();
        int a = Integer.parseInt(n);
        int arm = 0;
        int length = n.length();

    for (int i=0; i<length; i++) {
        int digit = Character.getNumericValue(n.charAt(i));
        arm += digit;
    }

    if (a % arm == 0)
        System.out.println(a + " is a Harshad number.");
    else
        System.out.println(a + " is not a Harshad number.");

    sc.close();
    }
}