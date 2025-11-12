import java.util.*;
public class EmployeeSalaryDirectory {
    public static void main(String[] args){
        Map<String,Double> salaries = new HashMap<>();
        salaries.put("Asha",55000.0);
        salaries.put("Ravi",60000.0);
        salaries.put("Kiran",50000.0);
        for(Map.Entry<String,Double> e : salaries.entrySet())
            System.out.println(e.getKey()+" earns "+e.getValue());
    }
}

