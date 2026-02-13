import java.util.Scanner;
public class addition {
    
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");  
        b = scanner.nextInt();
        scanner.close();
        int sum= sum(a, b); 
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
