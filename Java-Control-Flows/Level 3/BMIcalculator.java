import java.util.Scanner;

public class BMIcalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter weight (in KG):");
        int w = sc.nextInt();
        System.out.println("Enter height (in centimeters):");
        int h = sc.nextInt();

        int BMI = (w * 10000) / (h * h);

        System.out.println("The Body Mass Index (BMI) is: " + BMI);
        if (BMI < 18.5) {
            System.out.println("You are underweight.");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }



    sc.close();
    }
}