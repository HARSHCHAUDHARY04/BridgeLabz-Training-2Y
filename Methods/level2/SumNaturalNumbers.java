import java.util.*;
public class SumNaturalNumbers{
    public static int sumRecursive(int n){
        if(n==0)return 0;
        return n+sumRecursive(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int r1=sumRecursive(n);
        int r2=n*(n+1)/2;
        System.out.println("Sum using recursion:"+r1);
        System.out.println("Sum using formula:"+r2);
    }
}
