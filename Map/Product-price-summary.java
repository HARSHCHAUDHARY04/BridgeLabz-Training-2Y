import java.util.*;
public class ShoppingCartSummary {
    public static void main(String[] args){
        Map<String,Double> prices = new HashMap<>();
        prices.put("Phone",49999.0);
        prices.put("Charger",999.0);
        prices.put("Case",499.0);
        double total = 0;
        for(double p : prices.values()) total += p;
        System.out.println("Items -> "+prices);
        System.out.println("Total price -> "+total);
    }
}

