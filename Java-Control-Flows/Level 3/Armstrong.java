import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        String n = sc.nextLine();
        int a = Integer.parseInt(n);
        int arm = 0;
        int length = n.length();

    for (int i=0; i<length; i++) {
        int digit = Character.getNumericValue(n.charAt(i));
        arm += (int) Math.pow(digit, length);
    }

    if (a==arm)
        System.out.println(a + " is an Armstrong number.");
    else
        System.out.println(a + " is not an Armstrong number.");

    sc.close();
    }
}