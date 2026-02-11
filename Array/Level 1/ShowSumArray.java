import java.util.Scanner;

public class ShowSumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[10];
        System.out.println("Enter a number: ");
        
        for(int n=0; n<a.length; n++){
            double b = input.nextDouble();
            if (b < 1) {
              break;
            }else{a[n] = b;}
        }
        double c = 0;
        System.out.println("Values given:");
        for(int j=0; j<a.length; j++){
            if (a[j] > 0){
                System.out.println(a[j]);
                c += a[j];
            }
        }
       System.out.println("Sum: " + c);
       input.close();
    }
}       