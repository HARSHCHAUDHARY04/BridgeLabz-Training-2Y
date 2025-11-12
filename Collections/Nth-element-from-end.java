import java.util.*;
public class NthFromEndDemo {
    public static <T> T nthFromEnd(LinkedList<T> list, int n){
        if(n <= 0) throw new IllegalArgumentException("n must be > 0");
        Iterator<T> slowIt = list.iterator();
        Iterator<T> fastIt = list.iterator();
        int steps = 0;
        while(steps < n && fastIt.hasNext()){ fastIt.next(); steps++; }
        if(steps < n) throw new NoSuchElementException("List shorter than n");
        while(fastIt.hasNext()){
            slowIt.next();
            fastIt.next();
        }
        return slowIt.next();
    }
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println("N=2 from end -> " + nthFromEnd(list, 2));
    }
}

