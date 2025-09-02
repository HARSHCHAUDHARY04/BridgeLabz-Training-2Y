import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int physics = sc.nextInt();
        System.out.println("Enter the second number:");
        int chemistry = sc.nextInt();

        System.out.println("Enter the operation symbol:");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Addition: " + (physics + chemistry));
                break;
            case '-':
                System.out.println("Subtraction: " + (physics - chemistry));
                break;
            case '*':
                System.out.println("Multiplication: " + (physics * chemistry));
                break;
            case '/':
                System.out.println("Division: " + (physics / (double) chemistry));
                break;
            default:
                System.out.println("Invalid operation");
        }
        sc.close();
    }

    }