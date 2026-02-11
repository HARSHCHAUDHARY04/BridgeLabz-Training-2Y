import java.util.Scanner;

public class Checkprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();

    for (int i=2; i<=n/2; i++) {
        if (n%i==0) {
            System.out.println("Not Prime");
            break;
        }else {System.out.println("Prime");}
    }
    sc.close();
    }
}