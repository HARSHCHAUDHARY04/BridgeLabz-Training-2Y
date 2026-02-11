import java.util.*;
public class BMI{
    public static double calcBMI(double w,double h){
        h=h/100;
        return w/(h*h);
    }
    public static String status(double b){
        if(b<18.4)return "Underweight";
        if(b<=24.9)return "Normal";
        if(b<=39.9)return "Overweight";
        return "Obese";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double data[][]=new double[10][3];
        String s[]=new String[10];
        System.out.println("Enter weight(kg) and height(cm) of 10 persons:");
        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
            data[i][2]=calcBMI(data[i][0],data[i][1]);
            s[i]=status(data[i][2]);
        }
        for(int i=0;i<10;i++){
            System.out.println("Weight:"+data[i][0]+" Height:"+data[i][1]+" BMI:"+data[i][2]+" Status:"+s[i]);
        }
    }
}
