public class Product {
    private static double discount = 0.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount * 100 + "%");
        } else {
            System.out.println("Invalid object type");
        }
    }

    public static void main(String[] args) {
        Product item = new Product(1001, "Laptop", 80000.0, 2);
        item.displayDetails(item);
        updateDiscount(0.10);
        System.out.println("Updated Discount: " + discount * 100 + "%");
    }
}
