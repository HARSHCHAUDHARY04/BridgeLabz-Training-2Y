import java.util.*;
public class Quadratic{
    public static double[] roots(int a,int b,int c){
        double d=Math.pow(b,2)-4*a*c;
        if(d>0){
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            return new double[]{r1,r2};
        }else if(d==0){
            double r=-b/(2.0*a);
            return new double[]{r};
        }else return new double[]{};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a b c:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        double r[]=roots(a,b,c);
        if(r.length==0)System.out.println("No real roots");
        else{
            for(int i=0;i<r.length;i++)System.out.println("Root "+(i+1)+": "+r[i]);
        }
    }
}
