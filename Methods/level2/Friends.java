import java.util.*;
public class Friends{
    public static int youngest(int a[]){
        int m=0;
        for(int i=1;i<a.length;i++)if(a[i]<a[m])m=i;
        return m;
    }
    public static int tallest(int h[]){
        int m=0;
        for(int i=1;i<h.length;i++)if(h[i]>h[m])m=i;
        return m;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n[]={"Amar","Akbar","Anthony"};
        int age[]=new int[3],ht[]=new int[3];
        System.out.println("Enter ages of Amar Akbar Anthony:");
        for(int i=0;i<3;i++)age[i]=sc.nextInt();
        System.out.println("Enter heights of Amar Akbar Anthony:");
        for(int i=0;i<3;i++)ht[i]=sc.nextInt();
        System.out.println("Youngest:"+n[youngest(age)]);
        System.out.println("Tallest:"+n[tallest(ht)]);
    }
}
