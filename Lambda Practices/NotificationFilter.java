import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String patientId;
    String severity; // "CRITICAL", "WARNING", "INFO"

    public Alert(String patientId, String severity) {
        this.patientId = patientId;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "patientId='" + patientId + '\'' +
                ", severity='" + severity + '\'' +
                '}';
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("P101", "CRITICAL"));
        alerts.add(new Alert("P102", "INFO"));
        alerts.add(new Alert("P103", "WARNING"));
        alerts.add(new Alert("P104", "CRITICAL"));

        Predicate<Alert> criticalOnly = (alert) -> alert.severity.equals("CRITICAL");
        Predicate<Alert> criticalAndWarning = (alert) -> 
            alert.severity.equals("CRITICAL") || alert.severity.equals("WARNING");

        System.out.println("--- User Preference: CRITICAL Only ---");
        List<Alert> filteredAlerts = alerts.stream()
            .filter(criticalOnly)
            .collect(Collectors.toList());
        filteredAlerts.forEach(a -> System.out.println(a));
        
        System.out.println("\n--- User Preference: CRITICAL and WARNING ---");
        List<Alert> filteredAlerts2 = alerts.stream()
            .filter(criticalAndWarning)
            .collect(Collectors.toList());
        filteredAlerts2.forEach(a -> System.out.println(a));
    }
}