import java.util.Scanner;

class java5 {
    public static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < idx; j++) {
                if (temp[j] == c) { seen = true; break; }
            }
            if (!seen) temp[idx++] = c;
        }
        char[] res = new char[idx];
        System.arraycopy(temp, 0, res, 0, idx);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = uniqueChars(text);
        System.out.println("Character Frequency:");
        for (char c : unique) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == c) count++;
            }
            System.out.println(c + " -> " + count);
        }

        sc.close();
    }
}
