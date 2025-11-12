import java.util.*;
public class InventoryManager {
    public static void main(String[] args){
        Map<String,Integer> inventory = new HashMap<>();
        inventory.put("Laptop",10);
        inventory.put("Phone",20);
        inventory.put("Headphones",15);
        inventory.put("Laptop",inventory.get("Laptop")-2);
        System.out.println(inventory);
    }
}

