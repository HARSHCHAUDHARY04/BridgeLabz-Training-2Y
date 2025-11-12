import java.util.*;
public class ReverseListDemo {
    public static <T> List<T> reverseList(List<T> input){
        List<T> result = new ArrayList<>(input.size());
        for(int i = input.size() - 1; i >= 0; i--) result.add(input.get(i));
        return result;
    }
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> linkedList = new LinkedList<>(arrayList);
        System.out.println("ArrayList original -> " + arrayList);
        System.out.println("ArrayList reversed -> " + reverseList(arrayList));
        System.out.println("LinkedList original -> " + linkedList);
        System.out.println("LinkedList reversed -> " + reverseList(linkedList));
    }
}

