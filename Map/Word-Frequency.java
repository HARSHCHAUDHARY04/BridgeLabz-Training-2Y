import java.util.*;
public class SentenceWordFrequency {
    public static void main(String[] args){
        String s = "this is a test this is only a test";
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String w : s.split(" ")) map.put(w,map.getOrDefault(w,0)+1);
        System.out.println(map);
    }
}

