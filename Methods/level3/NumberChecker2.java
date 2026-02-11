import java.util.*;
public class NumberChecker2{
    public static int countDigits(int n){
        int c=0;
        while(n>0){c++;n/=10;}
        return c;
    }
    public static int[] digitsArray(int n){
        int c=countDigits(n);
        int a[]=new int[c];
        for(int i=c-1;i>=0;i--){a[i]=n%10;n/=10;}
        return a;
    }
    public static int sumDigits(int a[]){
        int s=0;
        for(int i=0;i<a.length;i++)s+=a[i];
        return s;
    }
    public static int sumSquares(int a[]){
        int s=0;
        for(int i=0;i<a.length;i++)s+=Math.pow(a[i],2);
        return s;
    }
    public static boolean isHarshad(int n,int a[]){
        int s=sumDigits(a);
        if(s==0)return false;
        return n%s==0;
    }
    public static int[][] digitFrequency(int a[]){
        int f[][]=new int[10][2];
        for(int i=0;i<10;i++)f[i][0]=i;
        for(int i=0;i<a.length;i++)f[a[i]][1]++;
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int d[]=digitsArray(n);
        System.out.println("Count of digits:"+countDigits(n));
        System.out.print("Digits array: ");
        for(int x:d)System.out.print(x+" ");
        System.out.println();
        System.out.println("Sum of digits:"+sumDigits(d));
        System.out.println("Sum of squares:"+sumSquares(d));
        System.out.println("Harshad number:"+isHarshad(n,d));
        int f[][]=digitFrequency(d);
        System.out.println("Digit frequencies:");
        for(int i=0;i<10;i++){
            if(f[i][1]>0)System.out.println("Digit "+f[i][0]+" : "+f[i][1]);
        }
    }
}
