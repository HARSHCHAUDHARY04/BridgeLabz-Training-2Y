import java.util.Scanner;

class java8 {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String s2 = sc.nextLine();

        System.out.println("Are anagrams? " + isAnagram(s1, s2));

        sc.close();
    }
}
