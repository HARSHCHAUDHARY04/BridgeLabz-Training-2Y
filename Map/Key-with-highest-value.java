import java.util.*;
public class HighestValueKey {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("A",40); map.put("B",70); map.put("C",55);
        String maxKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Key with highest value -> " + maxKey);
    }
}

