import java.util.*;
public class UnitConvertor2{
    public static double convertYardsToFeet(double y){
        return y*3;
    }
    public static double convertFeetToYards(double f){
        return f*0.3333333;
    }
    public static double convertMetersToInches(double m){
        return m*39.3701;
    }
    public static double convertInchesToMeters(double i){
        return i*0.0254;
    }
    public static double convertInchesToCm(double i){
        return i*2.54;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.YardsToFeet 2.FeetToYards 3.MetersToInches 4.InchesToMeters 5.InchesToCm");
        int ch=sc.nextInt();
        System.out.println("Enter value:");
        double v=sc.nextDouble();
        if(ch==1)System.out.println(convertYardsToFeet(v));
        else if(ch==2)System.out.println(convertFeetToYards(v));
        else if(ch==3)System.out.println(convertMetersToInches(v));
        else if(ch==4)System.out.println(convertInchesToMeters(v));
        else if(ch==5)System.out.println(convertInchesToCm(v));
        else System.out.println("Invalid");
    }
}
