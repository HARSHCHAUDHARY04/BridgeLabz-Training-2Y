import java.util.Scanner;

public class CollinearPoints{

    public static boolean checkCollinearSlope(int x1,int y1,int x2,int y2,int x3,int y3){
        int slopeAB_num = (y2-y1)*(x3-x2);
        int slopeBC_num = (y3-y2)*(x2-x1);
        return slopeAB_num==slopeBC_num;
    }

    public static boolean checkCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3){
        int area = x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);
        return area==0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        int x1=sc.nextInt(); int y1=sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2=sc.nextInt(); int y2=sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3=sc.nextInt(); int y3=sc.nextInt();

        boolean slopeMethod=checkCollinearSlope(x1,y1,x2,y2,x3,y3);
        boolean areaMethod=checkCollinearArea(x1,y1,x2,y2,x3,y3);

        if(slopeMethod && areaMethod){
            System.out.println("The points are Collinear");
        }else{
            System.out.println("The points are NOT Collinear");
        }
    }
}
