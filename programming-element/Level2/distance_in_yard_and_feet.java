import java.util.Scanner;

public class distance_in_yard_and_feet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanceInFeet = sc.nextInt();
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInFeet / 5280.0;
        
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
        sc.close();
    }
}
