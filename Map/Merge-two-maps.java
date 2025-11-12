import java.util.*;
public class MergeTwoMaps {
    public static void main(String[] args){
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("A",1); m1.put("B",2);
        Map<String,Integer> m2 = new HashMap<>();
        m2.put("B",3); m2.put("C",4);
        Map<String,Integer> result = new HashMap<>(m1);
        for(Map.Entry<String,Integer> e : m2.entrySet())
            result.merge(e.getKey(), e.getValue(), Integer::sum);
        System.out.println(result);
    }
}

