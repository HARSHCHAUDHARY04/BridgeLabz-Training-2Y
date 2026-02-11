import java.util.*;
public class area_of_triange {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        double area=(double)(base*height)/2;
        System.out.println("The area of triangle with base "+base+" and height "+height+" is "+area);
        sc.close();
    }
}
