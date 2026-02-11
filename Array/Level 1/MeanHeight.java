import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double s=0;
        for(int i=0; i<heights.length; i++){
            System.out.println("Enter height for person " + (i+1) + ": ");
            heights[i] = input.nextDouble();
            s += heights[i];
        }
        double mean = s / heights.length;
        System.out.println("Mean height: " + mean);
    }
}