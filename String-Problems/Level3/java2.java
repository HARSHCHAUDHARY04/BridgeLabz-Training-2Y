import java.util.Scanner;

class java2 {
    public static char[] findUnique(String text) {
        char[] result = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[index++] = c;
        }
        char[] finalArr = new char[index];
        System.arraycopy(result, 0, finalArr, 0, index);
        return finalArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");

        sc.close();
    }
}
