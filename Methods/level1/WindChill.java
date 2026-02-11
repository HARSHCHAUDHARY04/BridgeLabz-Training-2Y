import java.util.Scanner;
public class WindChill {
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed in mph: ");
        double windSpeed = sc.nextDouble();
        System.out.println("Wind Chill Temperature: " + calculateWindChill(temp, windSpeed));
    }
}
