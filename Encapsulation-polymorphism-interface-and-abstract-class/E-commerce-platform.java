abstract class Product {
    protected String productId;
    protected String name;
    protected double price;

    public abstract double calculateDiscount();

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

class Electronics extends Product {
    private double discountRate;

    public Electronics(String productId, String name, double price, double discountRate) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }

    public double calculateDiscount() {
        return price * discountRate;
    }

    public double getDiscountRate() { return discountRate; }
    public void setDiscountRate(double discountRate) { this.discountRate = discountRate; }
}

class Clothing extends Product {
    private double discountRate;

    public Clothing(String productId, String name, double price, double discountRate) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }

    public double calculateDiscount() {
        return price * discountRate;
    }

    public double getDiscountRate() { return discountRate; }
    public void setDiscountRate(double discountRate) { this.discountRate = discountRate; }
}

class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double calculateDiscount() {
        return 0.0;
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class TaxableProduct implements Taxable {
    private double taxRate;

    public TaxableProduct(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateTax() {
        return price * taxRate;
    }

    public String getTaxDetails() {
        return "Tax Rate: " + taxRate + "%";
    }

    public double getTaxRate() { return taxRate; }
    public void setTaxRate(double taxRate) { this.taxRate = taxRate; }
}

class ECommerceProcessor {
    public static void printFinalPrice(Product[] products) {
        for (Product p : products) {
            double finalPrice = p.getPrice() + p.calculateTax() - p.calculateDiscount();
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}
