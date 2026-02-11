import java.util.*;
public class Factors{
    public static int[] getFactors(int n){
        int c=0;
        for(int i=1;i<=n;i++)if(n%i==0)c++;
        int a[]=new int[c];int j=0;
        for(int i=1;i<=n;i++)if(n%i==0)a[j++]=i;
        return a;
    }
    public static int sum(int a[]){
        int s=0;
        for(int i=0;i<a.length;i++)s+=a[i];
        return s;
    }
    public static int product(int a[]){
        int p=1;
        for(int i=0;i<a.length;i++)p*=a[i];
        return p;
    }
    public static int sumSquare(int a[]){
        int s=0;
        for(int i=0;i<a.length;i++)s+=Math.pow(a[i],2);
        return s;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int f[]=getFactors(n);
        System.out.println("Factors:");
        for(int i=0;i<f.length;i++)System.out.print(f[i]+" ");
        System.out.println("\nSum:"+sum(f));
        System.out.println("Product:"+product(f));
        System.out.println("Sum of squares:"+sumSquare(f));
    }
}
