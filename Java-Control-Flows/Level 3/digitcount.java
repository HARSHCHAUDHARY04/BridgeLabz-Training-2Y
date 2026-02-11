import java.util.Scanner;

public class digitcount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        String n = sc.nextLine();
        int length = n.length();
        System.out.println("The number of digits in the given number is: " + length);



    sc.close();
    }
}