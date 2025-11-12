import java.util.*;
public class CourseRegistrationSystem {
    public static void main(String[] args){
        Map<String,List<String>> reg = new HashMap<>();
        reg.computeIfAbsent("CSE101",k->new ArrayList<>()).add("Asha");
        reg.computeIfAbsent("CSE101",k->new ArrayList<>()).add("Ravi");
        reg.computeIfAbsent("CSE102",k->new ArrayList<>()).add("Neha");
        for(Map.Entry<String,List<String>> e : reg.entrySet())
            System.out.println(e.getKey()+" -> "+e.getValue());
    }
}

