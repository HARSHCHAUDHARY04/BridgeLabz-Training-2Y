import java.util.*;
public class UnitConvertor3{
    public static double convertFtoC(double f){
        return (f-32)*5/9;
    }
    public static double convertCtoF(double c){
        return (c*9/5)+32;
    }
    public static double convertPoundsToKg(double p){
        return p*0.453592;
    }
    public static double convertKgToPounds(double k){
        return k*2.20462;
    }
    public static double convertGallonsToLiters(double g){
        return g*3.78541;
    }
    public static double convertLitersToGallons(double l){
        return l*0.264172;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.FtoC 2.CtoF 3.PoundsToKg 4.KgToPounds 5.GallonsToLiters 6.LitersToGallons");
        int ch=sc.nextInt();
        System.out.println("Enter value:");
        double v=sc.nextDouble();
        if(ch==1)System.out.println(convertFtoC(v));
        else if(ch==2)System.out.println(convertCtoF(v));
        else if(ch==3)System.out.println(convertPoundsToKg(v));
        else if(ch==4)System.out.println(convertKgToPounds(v));
        else if(ch==5)System.out.println(convertGallonsToLiters(v));
        else if(ch==6)System.out.println(convertLitersToGallons(v));
        else System.out.println("Invalid");
    }
}
