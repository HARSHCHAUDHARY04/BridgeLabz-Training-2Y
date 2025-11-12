import java.util.*;
public class RemoveDuplicatesPreserveOrder {
    public static <T> List<T> removeDuplicates(List<T> list){
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();
        for(T item : list) if(seen.add(item)) result.add(item);
        return result;
    }
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(3,1,2,2,3,4);
        System.out.println(removeDuplicates(input));
    }
}

