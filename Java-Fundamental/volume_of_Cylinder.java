import java.util.Scanner;
public class volume_of_Cylinder {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        int radius = sc.nextInt();
        System.out.print("Enter the height of the cylinder: ");
        int height = sc.nextInt();
        sc.close();
        double volume = Math.PI * radius * radius * height;
        System.out.print("The volume of the cylinder with radius "+radius+" and height "+height+" is: "+ String.format("%.2f", volume));
    }
}
