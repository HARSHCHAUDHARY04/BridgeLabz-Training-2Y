import java.util.Scanner;
public class area_of_triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        double areaInCm = (double)(base * height) / 2;
        double areaInInches = areaInCm / (2.54 * 2.54);
        System.out.println("The area of the triangle with base " + base + " cm and height " + height + " cm is " + areaInCm + " sq cm and " + areaInInches + " sq in");
        sc.close();
    }
}
