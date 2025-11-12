import java.util.*;
public class WebsiteVisitTracker {
    public static void main(String[] args){
        Map<String,Integer> visits = new HashMap<>();
        List<String> pages = Arrays.asList("/home","/about","/home","/contact","/home");
        for(String p : pages) visits.put(p,visits.getOrDefault(p,0)+1);
        System.out.println(visits);
    }
}

