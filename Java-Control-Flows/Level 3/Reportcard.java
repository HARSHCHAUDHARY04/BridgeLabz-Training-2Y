import java.util.Scanner;

public class Reportcard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks for Physics:");
        int physics = sc.nextInt();
        System.out.println("Enter marks for Chemistry:");
        int chemistry = sc.nextInt();
        System.out.println("Enter marks for Mathematics:");
        int mathematics = sc.nextInt();

        int total = physics + chemistry + mathematics;
        double average = total / 3.0;
        double percentage = (total / 300.0) * 100;

        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
     
    if (percentage >= 80) {
        System.out.println("A");
        System.out.println("Level 4, above agency-normalized standards");
    } else if (percentage<=79 && percentage >= 70) {
        System.out.println("B");
        System.out.println("Level 3, at agency-normalized standards");
    } else if (percentage<=69 && percentage >= 60) {
        System.out.println("C");
        System.out.println("Level 2, below, but approaching agency-normalized standards");
    } else if (percentage<=59 && percentage >= 50) {
        System.out.println("D");
        System.out.println("Level 1, well below agency-normalized standards");
    } else if (percentage<=49 && percentage >= 40) {
        System.out.println("E");
        System.out.println("Level 1- , too below agency-normalized standards");
    } else {
        System.out.println("R");
        System.out.println("Remedial standards");
    }
    
    sc.close();
    }
}