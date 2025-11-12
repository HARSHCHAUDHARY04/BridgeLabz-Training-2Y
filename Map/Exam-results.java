import java.util.*;
public class ExamResultsTopper {
    static class Result { String name; int marks; Result(String n,int m){ name=n; marks=m; } }
    public static void main(String[] args){
        Map<String,List<Result>> data = new HashMap<>();
        data.put("Maths", Arrays.asList(new Result("Asha",90), new Result("Ravi",85)));
        data.put("Science", Arrays.asList(new Result("Asha",92), new Result("Kiran",88)));
        for(Map.Entry<String,List<Result>> e : data.entrySet()){
            Result top = Collections.max(e.getValue(), Comparator.comparingInt(r->r.marks));
            System.out.println("Topper in "+e.getKey()+" -> "+top.name+" ("+top.marks+")");
        }
    }
}

