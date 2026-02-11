import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] Friends = new String[3][3];

        Friends[0][0] = "Amar";
        Friends[1][0] = "Akbar";
        Friends[2][0] = "Anthanoy";

        for (int i=0; i<3; i++){
            System.out.println("Enter age for " + Friends[i][0] + ": ");
            Friends[i][1] = input.nextLine();
            System.out.println("Enter height for " + Friends[i][0] + ": ");
            Friends[i][2] = input.nextLine();
        }
        int youngestIndex = 0;
        for (int i=1; i<3; i++){
            if (Integer.parseInt(Friends[i][1]) < Integer.parseInt(Friends[youngestIndex][1])){
                youngestIndex = i;
            }
        }
        int tallestIndex = 0;
        for (int i=1; i<3; i++){
            if (Integer.parseInt(Friends[i][2]) > Integer.parseInt(Friends[tallestIndex][2])){
                tallestIndex = i;
            }
        }
        System.out.println("The youngest friend is " + Friends[youngestIndex][0] + " with age " + Friends[youngestIndex][1]);
        System.out.println("The tallest friend is " + Friends[tallestIndex][0] + " with height " + Friends[tallestIndex][2]);
    }
}
