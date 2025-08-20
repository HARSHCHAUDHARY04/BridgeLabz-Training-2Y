import java.util.Scanner;

public class distance_in_yards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distabce_in_feet= sc.nextInt();
        int distance_in_cm = distabce_in_feet * 30;
        double distance_in_yards = distance_in_cm / 91.44;
        System.out.println("The distance in yards is " + distance_in_yards + " for the given distance in feet " + distabce_in_feet);
        sc.close();
    }
}
