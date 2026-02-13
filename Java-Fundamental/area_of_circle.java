import java.util.*;

public class area_of_circle {
    
    public static double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        sc.close();
        double area = calculateArea(radius);
        System.out.printf("The area of the circle with radius %d is: %.2f%n", radius, area);
    }
}
