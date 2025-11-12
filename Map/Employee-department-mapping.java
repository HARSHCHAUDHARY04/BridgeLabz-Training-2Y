import java.util.*;
public class EmployeeDepartmentMapping {
    public static void main(String[] args){
        Map<String,String> dept = new HashMap<>();
        dept.put("Asha","IT");
        dept.put("Ravi","Finance");
        dept.put("Kiran","HR");
        for(Map.Entry<String,String> e : dept.entrySet())
            System.out.println(e.getKey()+" -> "+e.getValue());
    }
}

