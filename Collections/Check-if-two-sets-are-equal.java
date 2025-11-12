import java.util.*;
public class SetEqualityCheck {
    public static <T> boolean areEqual(Set<T> a, Set<T> b){
        return a.equals(b);
    }
    public static void main(String[] args){
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));
        System.out.println("Sets equal? " + areEqual(s1, s2));
    }
}

