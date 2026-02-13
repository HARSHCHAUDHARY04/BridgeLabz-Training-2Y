import java.util.Scanner;

public class Celsius_to_Fahrenheit_conversion {
    
    public static float conversion(float a) {
        float Fahrenheit=(a*(9.0f/5.0f))+32.0f;
        return Fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float value_in_Celsius=sc.nextFloat();
        sc.close();
        float result=conversion(value_in_Celsius);
        System.out.printf("Final conversion is %.2f",result);

    }
}
