import java.util.*;
public class SymmetricDifferenceDemo {
    public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<>(a);
        for(T item : b) if(!result.remove(item)) result.add(item);
        return result;
    }
    public static void main(String[] args){
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println("Symmetric difference -> " + symmetricDifference(s1,s2));
    }
}

