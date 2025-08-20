import java.util.Scanner;
public class side_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The side length of the square with perimeter " + perimeter + " is " + side);
        sc.close();
    }
}
