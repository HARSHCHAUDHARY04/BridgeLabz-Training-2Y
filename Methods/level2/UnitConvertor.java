import java.util.*;
public class UnitConvertor{
    public static double convertKmToMiles(double km){
        return km*0.621371;
    }
    public static double convertMilesToKm(double mi){
        return mi*1.60934;
    }
    public static double convertMetersToFeet(double m){
        return m*3.28084;
    }
    public static double convertFeetToMeters(double f){
        return f*0.3048;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.KmToMiles 2.MilesToKm 3.MetersToFeet 4.FeetToMeters");
        int ch=sc.nextInt();
        System.out.println("Enter value:");
        double v=sc.nextDouble();
        if(ch==1)System.out.println(convertKmToMiles(v));
        else if(ch==2)System.out.println(convertMilesToKm(v));
        else if(ch==3)System.out.println(convertMetersToFeet(v));
        else if(ch==4)System.out.println(convertFeetToMeters(v));
        else System.out.println("Invalid");
    }
}
