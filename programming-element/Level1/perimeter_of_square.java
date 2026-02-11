import java.util.Scanner;

public class perimeter_of_square {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int perimeter = 4 * side;
        System.out.println("The perimeter of the square with side length " + side + " is " + perimeter);
        sc.close();
    }
}
