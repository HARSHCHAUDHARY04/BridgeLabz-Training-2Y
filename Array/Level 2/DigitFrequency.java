import java.util.Scanner;


public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int a = input.nextInt();
        int[] numbers = new int[a];

        // Take input for each digit
        for (int i = 0; i < a; i++) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        int[] frequency = new int[100];
        
        for (int j = 0; j < a; j++) {
            frequency[numbers[j]]++;
        }
        
        System.out.print("Digit Frequency: ");
        for (int k = 0; k < 100; k++) {
            if (frequency[k] > 0) {
                System.out.print(k + " -> " + frequency[k] + ", ");
            }
        }
                
        

        input.close();
    }
}