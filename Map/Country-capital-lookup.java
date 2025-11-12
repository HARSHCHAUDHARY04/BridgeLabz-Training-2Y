import java.util.*;
public class CountryCapitalLookup {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("India","New Delhi");
        map.put("France","Paris");
        map.put("Japan","Tokyo");
        Scanner sc = new Scanner(System.in);
        String c = "India";
        System.out.println(c + " -> " + map.getOrDefault(c,"Not Found"));
        sc.close();
    }
}

