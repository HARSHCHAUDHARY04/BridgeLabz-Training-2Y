import java.util.*;
public class NumberChecker5{
    public static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum==n;
    }
    public static boolean isAbundant(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum>n;
    }
    public static boolean isDeficient(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum<n;
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static boolean isStrong(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+factorial(d);
            n=n/10;
        }
        return sum==temp;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println("Perfect:"+isPerfect(n));
        System.out.println("Abundant:"+isAbundant(n));
        System.out.println("Deficient:"+isDeficient(n));
        System.out.println("Strong:"+isStrong(n));
    }
}
