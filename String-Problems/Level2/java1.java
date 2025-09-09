import java.util.Scanner;

class java1 {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int custom = customLength(text);
        int builtin = text.length();

        System.out.println("Custom Length: " + custom);
        System.out.println("Built-in Length: " + builtin);

        sc.close();
    }
}
