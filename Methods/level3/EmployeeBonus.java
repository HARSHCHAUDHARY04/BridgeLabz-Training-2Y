import java.util.Random;

public class EmployeeBonus{
    public static int[][] generateData(int n){
        Random rand=new Random();
        int[][] data=new int[n][2];
        for(int i=0;i<n;i++){
            int salary=rand.nextInt(90000)+10000;
            int years=rand.nextInt(10)+1;
            data[i][0]=salary;
            data[i][1]=years;
        }
        return data;
    }
    public static double[][] calculateBonus(int[][] data){
        int n=data.length;
        double[][] result=new double[n][3];
        for(int i=0;i<n;i++){
            int salary=data[i][0];
            int years=data[i][1];
            double bonus;
            if(years>=5){
                bonus=salary*0.05;
            }else{
                bonus=salary*0.02;
            }
            double newSalary=salary+bonus;
            result[i][0]=salary;
            result[i][1]=bonus;
            result[i][2]=newSalary;
        }
        return result;
    }
    public static void display(double[][] result,int[][] data){
        double totalOld=0,totalBonus=0,totalNew=0;
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
                          "Salary","Years","Bonus","NewSalary","Total");
        for(int i=0;i<result.length;i++){
            System.out.printf("%-10.0f %-10d %-10.0f %-10.0f\n",
                              result[i][0],data[i][1],result[i][1],result[i][2]);
            totalOld+=result[i][0];
            totalBonus+=result[i][1];
            totalNew+=result[i][2];
        }
        System.out.println("--------------------------------------------");
        System.out.printf("Total Old Salary: %.0f\n",totalOld);
        System.out.printf("Total Bonus     : %.0f\n",totalBonus);
        System.out.printf("Total New Salary: %.0f\n",totalNew);
    }
    public static void main(String[] args){
        int[][] data=generateData(10);
        double[][] result=calculateBonus(data);
        display(result,data);
    }
}
