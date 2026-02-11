import java.util.Scanner;

class java6 {
    public static String charType(char ch) {
        ch = Character.toLowerCase(ch);
        if (!Character.isLetter(ch)) return "Not a Letter";
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println(ch + "\t" + charType(ch));
        }

        sc.close();
    }
}
