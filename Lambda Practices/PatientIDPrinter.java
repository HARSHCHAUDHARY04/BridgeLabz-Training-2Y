import java.util.Arrays;
import java.util.List;

public class PatientIDPrinter {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("PID-8921", "PID-3456", "PID-7701");

        System.out.println("--- Printing all Patient IDs ---");
        patientIDs.forEach(System.out::println);
    }
}