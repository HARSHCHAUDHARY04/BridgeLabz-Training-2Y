import java.util.*;
public class AttendanceTracker {
    public static void main(String[] args){
        Map<String,Boolean> attendance = new HashMap<>();
        attendance.put("Asha",true);
        attendance.put("Ravi",false);
        attendance.put("Kiran",true);
        System.out.println("Present Students:");
        for(Map.Entry<String,Boolean> e : attendance.entrySet())
            if(e.getValue()) System.out.println(e.getKey());
    }
}

