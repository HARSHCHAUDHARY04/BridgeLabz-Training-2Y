import java.util.*;
public class LibraryCatalog {
    public static void main(String[] args){
        Map<String,String> catalog = new TreeMap<>();
        catalog.put("978001","Java Basics");
        catalog.put("978002","Data Structures");
        catalog.put("978003","OOP Concepts");
        for(Map.Entry<String,String> e : catalog.entrySet())
            System.out.println(e.getKey()+" : "+e.getValue());
    }
}

