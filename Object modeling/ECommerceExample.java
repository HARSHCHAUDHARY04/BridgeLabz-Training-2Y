import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showProducts() {
        System.out.println("Order ID: " + orderId + " contains products:");
        for (Product p : products) {
            p.showProduct();
        }
    }
}

class Customer {
    String name;
    ArrayList<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order o) {
        orders.add(o);
    }

    void showOrders() {
        System.out.println("Customer: " + name + " placed orders:");
        for (Order o : orders) {
            o.showProducts();
        }
    }
}

public class ECommerceExample {
    public static void main(String[] args) {
       
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Headphones", 150.00);
        Product p3 = new Product("Smartphone", 800.00);

        
        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p3);

        
        Customer customer = new Customer("Alice");
        customer.placeOrder(o1);
        customer.placeOrder(o2);

        
        customer.showOrders();
    }
}
