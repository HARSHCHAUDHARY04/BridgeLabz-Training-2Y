import java.util.Scanner;

public class total_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitPrice = sc.nextInt();
        int quantity = sc.nextInt();
        int totalPrice = unitPrice * quantity;
        System.out.println("The total price for " + quantity + " units at a unit price of " + unitPrice + " is " + totalPrice);
        sc.close();
    }
}
