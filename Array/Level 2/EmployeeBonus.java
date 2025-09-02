import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            while (true) {
                System.out.print("Salary: ");
                if (input.hasNextDouble()) {
                    salary[i] = input.nextDouble();
                    if (salary[i] > 0) break;
                } else {
                    input.next(); 
                }
                System.out.println("Invalid salary. Please enter a positive number.");
            }
            while (true) {
                System.out.print("Years of Service: ");
                if (input.hasNextDouble()) {
                    yearsOfService[i] = input.nextDouble();
                    if (yearsOfService[i] >= 0) break;
                } else {
                    input.next();
                }
                System.out.println("Invalid years of service. Please enter a non-negative number.");
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        
        System.out.println("\nEmployee\tOld Salary\tBonus\t\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", (i + 1), salary[i], bonus[i], newSalary[i]);
        }
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        input.close();
    }
}