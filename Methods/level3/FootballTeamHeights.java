public class FootballTeamHeights{
    public static int sum(int a[]){
        int s=0;
        for(int i=0;i<a.length;i++)s+=a[i];
        return s;
    }
    public static double mean(int a[]){
        return sum(a)/(double)a.length;
    }
    public static int shortest(int a[]){
        int m=a[0];
        for(int i=1;i<a.length;i++)if(a[i]<m)m=a[i];
        return m;
    }
    public static int tallest(int a[]){
        int m=a[0];
        for(int i=1;i<a.length;i++)if(a[i]>m)m=a[i];
        return m;
    }
    public static void main(String args[]){
        int h[]=new int[11];
        for(int i=0;i<11;i++)h[i]=150+(int)(Math.random()*101);
        System.out.println("Heights:");
        for(int x:h)System.out.print(x+" ");
        System.out.println();
        System.out.println("Shortest:"+shortest(h));
        System.out.println("Tallest:"+tallest(h));
        System.out.println("Mean:"+mean(h));
    }
}
