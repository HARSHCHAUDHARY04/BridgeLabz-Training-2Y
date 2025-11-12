import java.util.*;
public class RotateListDemo {
    public static <T> List<T> rotate(List<T> list, int positions){
        int n = list.size();
        if(n == 0) return new ArrayList<>();
        int k = ((positions % n) + n) % n;
        List<T> result = new ArrayList<>(n);
        for(int i = 0; i < n; i++) result.add(list.get((i + k) % n));
        return result;
    }
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(10,20,30,40,50);
        System.out.println("Rotate by 2 -> " + rotate(input, 2));
    }
}

