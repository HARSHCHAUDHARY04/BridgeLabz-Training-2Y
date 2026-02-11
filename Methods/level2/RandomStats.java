public class RandomStats{
    public static int[] generate4DigitRandomArray(int size){
        int a[]=new int[size];
        for(int i=0;i<size;i++)a[i]=1000+(int)(Math.random()*9000);
        return a;
    }
    public static double[] findAverageMinMax(int a[]){
        int min=a[0],max=a[0],sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
        double avg=sum/(double)a.length;
        return new double[]{avg,min,max};
    }
    public static void main(String args[]){
        int a[]=generate4DigitRandomArray(5);
        System.out.println("Numbers:");
        for(int x:a)System.out.print(x+" ");
        System.out.println();
        double r[]=findAverageMinMax(a);
        System.out.println("Average:"+r[0]);
        System.out.println("Min:"+r[1]);
        System.out.println("Max:"+r[2]);
    }
}
