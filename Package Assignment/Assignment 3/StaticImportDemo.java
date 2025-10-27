import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double num1 = 25.0;
        double num2 = 16.0;
        double num3 = -10.5;
        
        System.out.println("Square Root of " + num1 + ": " + sqrt(num1));
        System.out.println(num1 + " raised to power 3: " + pow(num1, 3));
        System.out.println("Maximum of " + num1 + " and " + num2 + ": " + max(num1, num2));
        System.out.println("Minimum of " + num1 + " and " + num2 + ": " + min(num1, num2));
        System.out.println("Absolute value of " + num3 + ": " + abs(num3));
    }
}

