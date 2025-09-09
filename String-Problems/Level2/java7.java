import java.util.Scanner;

class java7 {
    public static String customTrim(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return text.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String custom = customTrim(text);
        String builtin = text.trim();

        System.out.println("Custom: [" + custom + "]");
        System.out.println("Built-in: [" + builtin + "]");
        System.out.println("Equal? " + custom.equals(builtin));

        sc.close();
    }
}
