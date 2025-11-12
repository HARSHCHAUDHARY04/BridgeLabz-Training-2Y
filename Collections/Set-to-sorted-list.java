import java.util.*;
public class SetToSortedList {
    public static List<Integer> toSortedList(Set<Integer> set){
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args){
        Set<Integer> input = new HashSet<>(Arrays.asList(5,3,9,1));
        System.out.println("Sorted list -> " + toSortedList(input));
    }
}

