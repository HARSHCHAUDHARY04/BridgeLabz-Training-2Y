import java.util.*;
public class StudentVoteChecker{
    public static boolean canStudentVote(int age){
        if(age<0)return false;
        if(age>=18)return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter ages of 10 students:");
        for(int i=0;i<10;i++)a[i]=sc.nextInt();
        for(int i=0;i<10;i++){
            if(canStudentVote(a[i]))System.out.println("Student "+(i+1)+": can vote");
            else System.out.println("Student "+(i+1)+": cannot vote");
        }
    }
}
