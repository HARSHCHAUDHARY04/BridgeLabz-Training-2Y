import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercaser {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> uppercasedNames = employeeNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercasedNames);
    }
}