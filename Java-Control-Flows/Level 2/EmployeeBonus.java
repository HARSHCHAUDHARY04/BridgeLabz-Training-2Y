import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;  
            System.out.println("Congratulations! You are eligible for a bonus.");
            System.out.println("Your bonus amount is: " + bonus);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }

        sc.close();
    }
}
