import java.util.*;
public class BankingTransactionSystem {
    static class Transaction {
        String id; String acc; double amount;
        Transaction(String id,String acc,double amount){ this.id=id; this.acc=acc; this.amount=amount; }
        public String toString(){ return id + ":" + acc + ":" + amount; }
    }
    public static void main(String[] args){
        List<Transaction> all = new ArrayList<>();
        all.add(new Transaction("T1","A1",500));
        all.add(new Transaction("T2","A2",1000));
        Queue<Transaction> queue = new LinkedList<>(all);
        Set<String> validAccounts = new HashSet<>(Arrays.asList("A1","A3"));
        Stack<Transaction> rollback = new Stack<>();
        while(!queue.isEmpty()){
            Transaction t = queue.poll();
            if(!validAccounts.contains(t.acc)){
                System.out.println("Invalid account " + t.acc + " skipping " + t.id);
                continue;
            }
            boolean success = t.amount % 2 == 1;
            if(success){
                System.out.println("Executed " + t);
                rollback.push(t);
            } else {
                System.out.println("Execution failed " + t);
            }
        }
        if(!rollback.isEmpty()){
            Transaction last = rollback.pop();
            System.out.println("Rolling back " + last);
        }
    }
}

