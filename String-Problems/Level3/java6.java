import java.util.Scanner;

class java6 {
    public static void findFrequency(String text) {
        char[] arr = text.toCharArray();
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[j] != '0') {
                    freq[i]++;
                    arr[j] = '0'; // mark visited
                }
            }
        }

        System.out.println("Character Frequency:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '
