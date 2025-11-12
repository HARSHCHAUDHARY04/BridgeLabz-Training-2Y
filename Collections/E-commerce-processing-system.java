import java.util.*;
public class EcommerceOrderProcessing {
    static class Order {
        String id;
        String customer;
        Order(String id, String customer){ this.id = id; this.customer = customer; }
        public boolean equals(Object o){ return o instanceof Order && ((Order)o).id.equals(id); }
        public int hashCode(){ return Objects.hash(id); }
        public String toString(){ return id + ":" + customer; }
    }
    public static void main(String[] args){
        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order("O1","A"));
        allOrders.add(new Order("O2","B"));
        allOrders.add(new Order("O1","A")); // duplicate
        Set<Order> unique = new HashSet<>(allOrders);
        Queue<Order> processingQueue = new LinkedList<>(unique);
        Stack<Order> failedStack = new Stack<>();
        while(!processingQueue.isEmpty()){
            Order o = processingQueue.poll();
            boolean success = o.id.hashCode() % 2 == 0; // mock success/fail
            if(success) System.out.println("Processed " + o);
            else {
                System.out.println("Failed " + o);
                failedStack.push(o);
            }
        }
        while(!failedStack.isEmpty()){
            Order retry = failedStack.pop();
            System.out.println("Reprocessing " + retry + " -> success");
        }
    }
}

