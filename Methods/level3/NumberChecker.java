import java.util.*;
public class NumberChecker{
    public static int countDigits(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;}
        return c;
    }
    public static int[] digitsArray(int n){
        int c=countDigits(n);
        int a[]=new int[c];
        for(int i=c-1;i>=0;i--){a[i]=n%10;n/=10;}
        return a;
    }
    public static boolean isDuck(int a[]){
        for(int i=0;i<a.length;i++)if(a[i]==0)return true;
        return false;
    }
    public static boolean isArmstrong(int n){
        int c=countDigits(n),sum=0,m=n;
        while(n>0){
            int d=n%10;
            sum+=Math.pow(d,c);
            n/=10;
        }
        return sum==m;
    }
    public static int[] largestTwo(int a[]){
        int f=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>f){s=f;f=a[i];}
            else if(a[i]>s&&a[i]!=f)s=a[i];
        }
        return new int[]{f,s};
    }
    public static int[] smallestTwo(int a[]){
        int f=Integer.MAX_VALUE,s=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<f){s=f;f=a[i];}
            else if(a[i]<s&&a[i]!=f)s=a[i];
        }
        return new int[]{f,s};
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
        System.out.println("Duck number:"+isDuck(d));
        System.out.println("Armstrong number:"+isArmstrong(n));
        int l[]=largestTwo(d);
        System.out.println("Largest:"+l[0]+" Second Largest:"+l[1]);
        int s[]=smallestTwo(d);
        System.out.println("Smallest:"+s[0]+" Second Smallest:"+s[1]);
    }
}
