import java.util.*;
public class NumberChecker4{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isNeon(int n){
        int sq=n*n;
        int sum=0;
        while(sq>0){
            sum=sum+sq%10;
            sq=sq/10;
        }
        return sum==n;
    }
    public static boolean isSpy(int n){
        int sum=0;
        int product=1;
        while(n>0){
            int d=n%10;
            sum=sum+d;
            product=product*d;
            n=n/10;
        }
        return sum==product;
    }
    public static boolean isAutomorphic(int n){
        int sq=n*n;
        String num=Integer.toString(n);
        String square=Integer.toString(sq);
        return square.endsWith(num);
    }
    public static boolean isBuzz(int n){
        return n%7==0||n%10==7;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println("Prime:"+isPrime(n));
        System.out.println("Neon:"+isNeon(n));
        System.out.println("Spy:"+isSpy(n));
        System.out.println("Automorphic:"+isAutomorphic(n));
        System.out.println("Buzz:"+isBuzz(n));
    }
}
