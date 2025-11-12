import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args){
        Map<String,Character> grades = new LinkedHashMap<>();
        grades.put("Asha",'A');
        grades.put("Rahul",'B');
        grades.put("Kiran",'A');
        for(Map.Entry<String,Character> e : grades.entrySet())
            System.out.println(e.getKey()+" -> "+e.getValue());
    }
}

