import java.util.*;
public class GroupByProperty {
    static class Employee {
        String dept; String name;
        Employee(String dept,String name){ this.dept=dept; this.name=name; }
        public String toString(){ return name; }
    }
    public static void main(String[] args){
        List<Employee> list = Arrays.asList(
            new Employee("HR","Asha"),
            new Employee("IT","Rahul"),
            new Employee("HR","Kiran"),
            new Employee("IT","Ravi")
        );
        Map<String,List<Employee>> grouped = new HashMap<>();
        for(Employee e : list)
            grouped.computeIfAbsent(e.dept,k->new ArrayList<>()).add(e);
        System.out.println(grouped);
    }
}

