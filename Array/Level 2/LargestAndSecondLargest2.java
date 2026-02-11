import java.util.Scanner;

public class LargestAndSecondLargest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxDigit = 10;
        int[] digit = new int[maxDigit];
        int index = 0;
        System.out.println("Enter digits one by one (enter -1 to stop):");
        while (true) {
            int num = input.nextInt();
            if (num == -1) {
                break;
            }
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digit.length; i++) {
                    temp[i] = digit[i];
                }
                digit = temp;
            }
            digit[index] = num;
            index++;
        }
        if (index == 0) {
            System.out.println("No digits entered.");
            return;
        }
        int a = digit[0];
        for (int i = 1; i < index; i++) {
            if (digit[i] > a) {
                a = digit[i];
            }
        }
        Integer b = null;
        for (int i = 0; i < index; i++) {
            if (digit[i] < a) {
                if (b == null || digit[i] > b) {
                    b = digit[i];
                }
            }
        }
        System.out.println("Largest digit: " + a);
        if (b != null) {
            System.out.println("Second largest digit: " + b);
        } else {
            System.out.println("Second largest digit does not exist.");
        }
    }
}