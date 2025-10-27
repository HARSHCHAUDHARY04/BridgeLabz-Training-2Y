import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

public class ECommerceSort {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.50, 4.5));
        products.add(new Product("Mouse", 25.00, 4.8));
        products.add(new Product("Keyboard", 75.99, 4.2));

        Comparator<Product> sortByPrice = (p1, p2) -> Double.compare(p1.price, p2.price);
        Comparator<Product> sortByRating = (p1, p2) -> Double.compare(p2.rating, p1.rating);

        System.out.println("--- Sorted by Price (Ascending) ---");
        Collections.sort(products, sortByPrice);
        products.forEach(p -> System.out.println(p));

        System.out.println("\n--- Sorted by Rating (Descending) ---");
        Collections.sort(products, sortByRating);
        products.forEach(p -> System.out.println(p));
    }
}