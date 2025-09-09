import java.util.*;
public class SimpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double p, r, t, si;
        System.out.println("Enter Principal amount:");
        p = sc.nextDouble();
        System.out.println("Enter Rate of Interest:");
        r = sc.nextDouble();
        System.out.println("Enter Time:");
        t = sc.nextDouble();
        si = (p * r * t) / 100;
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}
