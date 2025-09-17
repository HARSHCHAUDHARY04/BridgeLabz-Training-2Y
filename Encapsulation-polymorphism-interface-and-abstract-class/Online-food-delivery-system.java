abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;

    public abstract double calculateTotalPrice();

    public void displayDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Qty: " + quantity + ", Total: " + calculateTotalPrice());
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }
}

class NonVegItem extends FoodItem {
    private double extraCharge;

    public NonVegItem(String itemName, double price, int quantity, double extraCharge) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.extraCharge = extraCharge;
    }

    public double calculateTotalPrice() {
        return (price + extraCharge) * quantity;
    }

    public double getExtraCharge() { return extraCharge; }
    public void setExtraCharge(double extraCharge) { this.extraCharge = extraCharge; }
}

interface Discountable {
    void applyDiscount(double discountPercent);
    String getDiscountDetails();
}

class DiscountableItem implements Discountable {
    private double discountPercent;

    public DiscountableItem(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void applyDiscount(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getDiscountDetails() {
        return "Discount Applied: " + discountPercent + "%";
    }

    public double getDiscountPercent() { return discountPercent; }
    public void setDiscountPercent(double discountPercent) { this.discountPercent = discountPercent; }
}

class FoodOrderProcessor {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            item.displayDetails();
        }
    }
}
