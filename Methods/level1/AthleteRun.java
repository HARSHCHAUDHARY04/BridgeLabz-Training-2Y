import java.util.*;
public class AthleteRun {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double side1, side2, side3;
        System.out.println("side 1:");
        side1 = sc.nextDouble();
        System.out.println("side 2:");
        side2 = sc.nextDouble();
        System.out.println("side 3:");
        side3 = sc.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km");
    }
}
