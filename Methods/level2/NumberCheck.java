import java.util.*;
public class NumberCheck{
    public static boolean isPositive(int n){
        return n>0;
    }
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static int compare(int n1,int n2){
        if(n1>n2)return 1;
        if(n1==n2)return 0;
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<5;i++)a[i]=sc.nextInt();
        for(int i=0;i<5;i++){
            if(isPositive(a[i])){
                System.out.print(a[i]+" is positive and ");
                if(isEven(a[i]))System.out.println("even");
                else System.out.println("odd");
            }else System.out.println(a[i]+" is negative");
        }
        int r=compare(a[0],a[4]);
        if(r==0)System.out.println("First and last are equal");
        else if(r==1)System.out.println("First is greater");
        else System.out.println("First is smaller");
    }
}
