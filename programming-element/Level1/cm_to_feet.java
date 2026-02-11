import java.util.*;
public class cm_to_feet {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int height=sc.nextInt();
    double inches=height/2.54;
    double feet=inches/12.0;
    System.out.print("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);
    }
}
