import java.util.Scanner;

public class km_to_miles {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int km=sc.nextInt();
        double miles=1.6*km;
        System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
    }
}
