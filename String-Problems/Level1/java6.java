import java.util.Scanner;

class java6 {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text); // Uncomment to see abrupt stop
        handleException(text);

        sc.close();
    }
}
