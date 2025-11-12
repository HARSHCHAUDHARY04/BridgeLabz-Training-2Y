import java.util.*;
public class CustomerBalanceTracker {
    public static void main(String[] args){
        Map<String,Double> balances = new HashMap<>();
        balances.put("A1",5000.0);
        balances.put("A2",8000.0);
        balances.put("A3",2000.0);
        String acc = "A2";
        balances.put(acc,balances.get(acc)+2000);
        System.out.println(balances);
    }
}

