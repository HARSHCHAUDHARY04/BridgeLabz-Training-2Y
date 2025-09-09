import java.util.*;
public class MaxHandshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents;
        System.out.println("Enter number of students:");
        numberOfStudents = sc.nextInt();
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes possible is " + handshakes);
    }
}
