import java.util.Random;
import java.util.Scanner;
public class StudentScores {
    public static int[][] generateScores(int n){
        Random r=new Random();
        int[][] scores=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                scores[i][j]=r.nextInt(41)+60; 
            }
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores){
        int n=scores.length;
        double[][] result=new double[n][3];
        for(int i=0;i<n;i++){
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=(double)total/3;
            double perc=(total/300.0)*100;
            result[i][0]=total;
            result[i][1]=Math.round(avg*100.0)/100.0;
            result[i][2]=Math.round(perc*100.0)/100.0;
        }
        return result;
    }
    public static void display(int[][] scores,double[][] results){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-12s%-12s%n","Student","Physics","Chemistry","Maths","Total","Average","Percentage");
        for(int i=0;i<scores.length;i++){
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-12.2f%-12.2f%n",i+1,scores[i][0],scores[i][1],scores[i][2],results[i][0],results[i][1],results[i][2]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] scores=generateScores(n);
        double[][] results=calculateResults(scores);
        display(scores,results);
    }
}
