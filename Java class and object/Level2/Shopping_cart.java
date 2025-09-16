
public class Shopping_cart {
    private String itemName;
    private double price;
    private int quantity;

    public Shopping_cart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


    public void addItem(int quantity) {
        this.quantity += quantity;
        System.out.println(quantity + " " + itemName + "(s) added to the cart.");
    }

    public void removeItem(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " " + itemName + "(s) removed from the cart.");
        } else {
            System.out.println("Cannot remove more items than present in the cart.");
        }
    }

    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Total cost for " + quantity + " " + itemName + "(s): $" + totalCost);
    }


    public static void main(String[] args) {
        Shopping_cart cartItem = new Shopping_cart("Apple", 0.5, 10);
        
        cartItem.displayTotalCost(); 
        
        cartItem.addItem(5); 
        cartItem.displayTotalCost(); 
        
        cartItem.removeItem(3); 
        cartItem.displayTotalCost(); 
        
        cartItem.removeItem(20); 
    }
}   