import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month");
        int m = sc.nextInt(); 
        System.out.println("Enter the day");
        int d = sc.nextInt(); 
        System.out.println("Enter the year");
        int y = sc.nextInt(); 

        if (m > 0 && m < 13 && d > 0 && d <= 31 && y > 0) {

            int y0 = y - (14 - m) / 12;

            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            
            int d0 = (d + x + (31 * m0) / 12) % 7;
            
        if (d0 == 0) {
            System.out.println("The day is Sunday");
        } else if (d0 == 1) {
            System.out.println("The day is Monday");
        } else if (d0 == 2) {
            System.out.println("The day is Tuesday");
        } else if (d0 == 3) {
            System.out.println("The day is Wednesday");
        } else if (d0 == 4) {
            System.out.println("The day is Thursday");
        } else if (d0 == 5) {
            System.out.println("The day is Friday");
        } else if (d0 == 6) {
            System.out.println("The day is Saturday");
        } else {
            System.out.println("Invalid day");
        }
     }
        sc.close();
    }
}