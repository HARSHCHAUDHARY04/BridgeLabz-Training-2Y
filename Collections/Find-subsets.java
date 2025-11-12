import java.util.*;
public class SubsetCheck {
    public static <T> boolean isSubset(Set<T> small, Set<T> large){
        return large.containsAll(small);
    }
    public static void main(String[] args){
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3,4));
        System.out.println("Is subset? " + isSubset(s1,s2));
    }
}

