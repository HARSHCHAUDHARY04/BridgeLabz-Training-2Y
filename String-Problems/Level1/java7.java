import java.util.Scanner;

class java8 {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // throws exception if not a number
        System.out.println("Number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException!");
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
