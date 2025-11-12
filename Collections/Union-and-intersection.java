import java.util.*;
public class SetUnionIntersection {
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> u = new HashSet<>(a);
        u.addAll(b);
        return u;
    }
    public static <T> Set<T> intersection(Set<T> a, Set<T> b){
        Set<T> i = new HashSet<>(a);
        i.retainAll(b);
        return i;
    }
    public static void main(String[] args){
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println("Union -> " + union(s1,s2));
        System.out.println("Intersection -> " + intersection(s1,s2));
    }
}

