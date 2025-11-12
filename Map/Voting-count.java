import java.util.*;
public class VotingCount {
    public static void main(String[] args){
        List<String> votes = Arrays.asList("A","B","A","C","B","A");
        Map<String,Integer> count = new HashMap<>();
        for(String v : votes) count.put(v,count.getOrDefault(v,0)+1);
        String winner = Collections.max(count.entrySet(),Map.Entry.comparingByValue()).getKey();
        System.out.println("Votes -> "+count);
        System.out.println("Winner -> "+winner);
    }
}

